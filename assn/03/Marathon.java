class Marathon {
    public static void find_first_second(String[] names, int[] times){

        int first_id=0, second_id = 1;

        for (int i = 0; i < names.length; i++) {
            if (times[i] > times[first_id]){
                first_id = i;
            }else if (times[i] > times[second_id]){
                second_id = i;
            }
        }
        System.out.println("First Place is " + names[first_id] + ": " + times[first_id]);
        System.out.println("Second Place is " + names[second_id] + ": " + times[second_id]);

    }
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        /*for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }*/

        find_first_second(names, times);

    }
} 