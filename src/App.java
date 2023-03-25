public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.name = "Wanderléia";

        Adress userAdress = new Adress();
        userAdress.state = "BBMP";
        userAdress.city = "Salcity";
        userAdress.district = "Federation";
        userAdress.street = "minhas casa";
        userAdress.number = 1;
        System.out.println(user.adress.city);

        user.adress = new Adress();
        System.out.println("Antes: " + user.heigth);
        user.growUp();
        System.out.println("Depois: " + user.heigth);
    }
}
