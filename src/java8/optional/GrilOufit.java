package java8.optional;

import java.util.Optional;

public class GrilOufit {
    public static String getOutfitType(Girl girl){
        return Optional.ofNullable(girl) // Tạo ra Optional wrap lấy girl
            .map(Girl::getOutfit) // nếu girl != null thì lấy outfit ra xem kakaka :3 ngược lại trả ra Optional.empty()
            //.map(instanceObject::method) -> (arg) -> instanceObject.method(arg)
            // g -> g.getOutfit()
            // -> Girl.getOutfit()
//            .map(Outfit::getType) // nếu outfit != null thì lấy ra xem type của nó
//            .map(outfit -> Outfit.getType(outfit)) // nếu outfit != null thì lấy ra xem type của nó
//            .map(outfit -> outfit.getType()) // nếu outfit != null thì lấy ra xem type của nó
            .map(outfit -> outfit.getType()) // nếu outfit != null thì lấy ra xem type của nó

            //.map(outfit -> outfit.getType())
            .orElse("Không mặc gì"); // Nếu cuối cùng là Optional.empty() thì trả ra ngoài Không mặc gì.
    }

    public static void main(String[] args) {
        Outfit o = new Outfit();
//        o.setType("123");
        Girl g = new Girl(o) ;
        System.out.println(getOutfitType(null));
    }
}

class Outfit{
    public static String type;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}

class Girl{
    private Outfit outfit;
    Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }
}