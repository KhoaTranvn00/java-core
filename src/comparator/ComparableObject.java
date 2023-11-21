package comparator;

import java.util.*;

public class ComparableObject {

  public static void main(String[] args) {
    List<Player> footballTeam = new ArrayList<>();
    Player player1 = new Player(3, "John", 20);
    Player player2 = new Player(1, "Roger", 22);
    Player player3 = new Player(2, "Steven", 24);
    footballTeam.add(player1);
    footballTeam.add(player2);
    footballTeam.add(player3);


    System.out.println("Before Sorting : " + footballTeam);
    Collections.sort(footballTeam);                                             // 3. use with Collections.sort
    System.out.println("After Sorting normal : " + footballTeam);               // Note: this will modify original Object

    Comparator<Player> comparator = (p1, p2) -> - p1.getRanking() + p2.getRanking();  // avoid this because: Integer.MAX_VALUE – (-1)” will be less than zero -> Incorrect
    PlayerRankingComparator playerComparator = new PlayerRankingComparator();
    Collections.sort(footballTeam, comparator);
    System.out.println("After Sorting ranking : " + footballTeam);

    PlayerAgeComparator playerComparator1 = new PlayerAgeComparator();
    Collections.sort(footballTeam, playerComparator1);
    System.out.println("After Sorting age : " + footballTeam);

    footballTeam.sort(Comparator.comparing(Player::getRanking));
        System.out.println("After Sorting: " + footballTeam);


  }


}
class Player implements Comparable<Player>{                                     // 1. Need to implement Comparable
  private int ranking;
  private String name;
  private int age;

  Player(int ranking, String name, int age) {
    this.ranking = ranking;
    this.name = name;
    this.age = age;
  }

  public int getRanking() {
    return ranking;
  }
  public int getAge() {
    return age;
  }

  @Override
  public String toString(){
    return ranking + " " + name + " " + age;
  }

    @Override
  public int compareTo(Player otherPlayer) {                                    // 2. Override method compareTo
    return Integer.compare(getRanking(), otherPlayer.getRanking());
  }
}

class PlayerRankingComparator implements Comparator<Player> {

  @Override
  public int compare(Player firstPlayer, Player secondPlayer) {
    return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
  }

}

class PlayerAgeComparator implements Comparator<Player> {
  @Override
  public int compare(Player firstPlayer, Player secondPlayer) {
    return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
  }

}
