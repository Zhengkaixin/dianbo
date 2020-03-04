package 博饼;

import java.util.Scanner;

public class Game {
    static public void main(String []args){
        int giftsNum[]=new int[6];
        System.out.println("请输入参加博饼的人数：");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Player []players=new Player[n];
        System.out.println("请输入奖品个数：");
        System.out.println("输入状元奖品个数");
        giftsNum[0]=input.nextInt();
        System.out.println("输入对堂奖品个数");
        giftsNum[1]=input.nextInt();
        System.out.println("输入三红奖品个数");
        giftsNum[2]=input.nextInt();
        System.out.println("输入四进奖品个数");
        giftsNum[3]=input.nextInt();
        System.out.println("输入二举奖品个数");
        giftsNum[4]=input.nextInt();
        System.out.println("输入一秀奖品个数");
        giftsNum[5]=input.nextInt();//0代表状元奖品 1对堂奖品 2三红奖品 3四进奖品 4二举奖品 5一秀奖品
        for(int i=0;i<n;i++){
            players[i]= new Player();
        }
        String ch_=input.nextLine();
        while(!(giftsNum[1]==0&&giftsNum[2]==0&&giftsNum[3]==0&&giftsNum[4]==0&&giftsNum[5]==0)){
            for(int i=0;i<n;i++){
                int p=i+1;
                System.out.println("玩家"+p+"请掷骰子，输入y确认");
                String ch=input.nextLine();
                if(ch.equals("y")){
                    int x=players[i].setPoints();
                    if(x==1&&giftsNum[0]!=0){//状元插金花直接拿走状元奖品
                        giftsNum[0]--;
                        players[i].setGiftsNote(0,1);
                    }
                    else if(x==2){//六杯红拿走全部奖品，游戏结束
                        for(int k=0;k<6;k++){
                            players[i].setGiftsNote(k,giftsNum[k]);
                            giftsNum[k]=0;
                        }
                        break;
                    }
                    else if(x==3){
                        if(giftsNum[0]!=0){
                            players[i].setMasterNote(2);
                        }
                        else{
                            System.out.println("状元奖品已无");
                        }
                    }
                    else if(x==4){
                        if(giftsNum[0]!=0){
                            players[i].setMasterNote(1);
                        }
                        else{
                            System.out.println("状元奖品已无");
                        }
                    }

                    else if(x==5){
                        if(giftsNum[1]!=0){
                            giftsNum[1]--;
                            players[i].setGiftsNote(1,1);
                        }
                        else{
                            System.out.println("对堂奖品已无");
                        }
                    }
                    else if(x==6){
                        if(giftsNum[2]!=0){
                            giftsNum[2]--;
                            players[i].setGiftsNote(2,1);
                        }
                        else{
                            System.out.println("三红奖品已无");
                        }
                    }
                    else if(x==7){
                        if(giftsNum[3]!=0){
                            giftsNum[3]--;
                            players[i].setGiftsNote(3,1);
                        }
                        else{
                            System.out.println("四进奖品已无");
                        }
                    }
                    else if(x==8){
                        if(giftsNum[4]!=0){
                            giftsNum[4]--;
                            players[i].setGiftsNote(4,1);
                        }
                        else{
                            System.out.println("二举奖品已无");
                        }
                    }
                    else if(x==9){
                        if(giftsNum[5]!=0){
                            giftsNum[5]--;
                            players[i].setGiftsNote(5,1);
                        }
                        else{
                            System.out.println("一秀奖品已无");
                        }
                    }
                }
                else if(ch.equals("b")){
                    System.out.println("你开启了赌神模式");
                    players[i].cheat();
                    for(int k=0;k<6;k++){
                        players[i].setGiftsNote(k,giftsNum[k]);
                        giftsNum[k]=0;
                    }
                    break;
                }
            }
        }
        if(giftsNum[0]!=0){//追饼
            int max=0;
            int maxmasterNum=players[0].getMasterNumber();
            int maxmasterNote=players[0].getMasterNote();
            for(int i=1;i<n;i++){
                if(maxmasterNote<players[i].getMasterNote()||maxmasterNum<players[i].getMasterNumber()){
                    maxmasterNum=players[i].getMasterNumber();
                    maxmasterNote=players[i].getMasterNote();
                    max=i;
                }
            }
            players[max].setGiftsNote(0,1);
        }
        for(int j=0;j<n;j++){
            int p=j+1;
            System.out.println("玩家"+p+"获奖：");
            players[j].getGiftsNote();
        }
    }
}
