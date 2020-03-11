class Average {
    public static void main(String[] args) {

        double avg = calc_average(args);

        System.out.println(avg);
    }


    public static double calc_average(String[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {           
            int num = Integer.parseInt(nums[i]);
            sum += num;
        }

        double answer = (nums.length != 0) ? (double) sum / nums.length : 0;

        return answer;
    }
}