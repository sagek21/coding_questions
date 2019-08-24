public class intToRoman {

    public static void main(String[] args){
        Roman(32);
    }



    private static String Roman(int num) {
        StringBuilder  result = new StringBuilder();
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] chars= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(num!=0){
            for(int i =0; i<nums.length;i++){
                if(num>=nums[i]){
                    result.append(chars[i]);
                    num-=nums[i];
                    break;
                }
            }
        }
        System.out.print(result.toString());
        return result.toString();
    }

}
