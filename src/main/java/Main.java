public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        String res = director.force((int n) -> {
            for(int i =0; i<n; i++){
                System.out.println("Working");
            }
            return "Success";
        },5);
        System.out.println(res);

    }
}
