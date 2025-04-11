public class Arguments {
    public static void main(String[] args) {
        try {
            System.out.println("Arguments length : " + args.length);

            if (args.length == 3) {
                String name = args[0];

                int age = Integer.parseInt(args[1]);
                double percentage = Double.parseDouble(args[2]);

                System.out.println("name : " + name + "\n" + "age : " + age + "\n" + "percentage : " + percentage);
            } else {
                System.out.println("Index out of found");
            }
        } catch (Exception r) {
            r.printStackTrace();
        }

    }
}
