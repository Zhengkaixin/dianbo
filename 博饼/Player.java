package 博饼;


public class Player {
    private int points[]=new int[6];
    private int sign[]=new int[7];//计算骰子点数
    private int giftsNote[]=new int[6];//记录获得的礼物
    private int masterNote;//状元标记 0代表不是状元 1代表状元 2代表五子登科
    private int masterNumber;//状元点数
    public Player(){
        for(int i=0;i<7;i++){
            sign[i]=0;
        }
        for(int i=0;i<6;i++){
            giftsNote[i]=0;
        }
        masterNote=0;
        masterNumber=0;
        //setPoints();
    }
    public int setPoints(){
        for(int i=0;i<6;i++){
            points[i]= 1+(int) (Math.random()*6);
            System.out.print(points[i]+" ");
            sign[points[i]]++;
        }
        int n=definePoints();
        for(int i=0;i<7;i++) {
            sign[i] = 0;
        }
        return n;
    }
    public int definePoints(){
        if(sign[4]==4&&sign[2]==2){
            System.out.println("状元插金花,恭喜");
            return 1;
        }
        else if(sign[4]==6){
            System.out.println("六杯红,恭喜");
            return 2;
        }
        else if(sign[1]==5||sign[2]==5||sign[3]==5||sign[4]==5||sign[5]==5||sign[6]==5){
            System.out.println("五子登科,恭喜");
            for(int i=1;i<=6;i++){
                if(sign[i]==1)masterNumber+=i;
            }
            return 3;
        }
        else if(sign[4]==4){
            System.out.println("状元，恭喜");
            for(int i=1;i<=6;i++){
                if(sign[i]!=4&&sign[i]!=0)masterNumber+=i;
            }
            return 4;
        }
        else if(sign[1]==1&&sign[2]==1&&sign[3]==1&&sign[4]==1&&sign[5]==1&&sign[6]==1){
            System.out.println("对堂，恭喜");
            return 5;
        }
        else if(sign[4]==3){
            System.out.println("三红，恭喜");
            return 6;
        }
        else if(sign[1]==4||sign[2]==4||sign[3]==4||sign[5]==4||sign[6]==4){
            System.out.println("四进，恭喜");
            return 7;
        }
        else if(sign[4]==2){
            System.out.println("二举，恭喜");
            return 8;
        }
        else if(sign[4]==1){
            System.out.println("一秀，恭喜");
            return 9;
        }
        else{
            System.out.println("无奖，继续努力");
            return 10;
        }
        /*for(int i=0;i<7;i++){
            sign[i]=0;
        }*/
    }



    public void setMasterNote(int Note){
        masterNote=Note;
    }
   /* public void setMasterNumber(int Number){
        masterNumber=Number;
    }*/
    public int getMasterNote(){
        return masterNote;
    }
    public int getMasterNumber(){
        return masterNumber;
    }


    public void setGiftsNote(int gift,int number){
        giftsNote[gift]+=number;
    }
    public void getGiftsNote() {
        System.out.println("获得状元奖品"+giftsNote[0]+"个");
        System.out.println("获得对堂奖品"+giftsNote[1]+"个");
        System.out.println("获得三红奖品"+giftsNote[2]+"个");
        System.out.println("获得四进奖品"+giftsNote[3]+"个");
        System.out.println("获得二举奖品"+giftsNote[4]+"个");
        System.out.println("获得一秀奖品"+giftsNote[5]+"个");
    }

    public void cheat(){
        System.out.print("4 4 4 4 4 4");
        sign[4]+=6;
        int n=definePoints();
        sign[4]=0;
    }
}
