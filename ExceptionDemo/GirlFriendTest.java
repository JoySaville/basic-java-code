package ExceptionDemo;

public class GirlFriendTest {
    public static void main(String[] args) {
        try {
            GirlFriend gf = new GirlFriend("zjy",20);
            GirlFriend gf1 = new GirlFriend("hs",11);
        } catch (AgeOutBoundsException e) {
            e.printStackTrace();
        }catch (NameFormatException e) {
            e.printStackTrace();
        }

    }
}
