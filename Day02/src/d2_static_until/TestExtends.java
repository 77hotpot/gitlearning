package d2_static_until;

public class TestExtends {
    public static void main(String[] args) {
      newPhone newPhone1=new newPhone();
      newPhone1.call();
      newPhone1.sendMsg();
    }
}
//子类
class newPhone extends Phone{
    @Override
    public void call(){
            super.call();
            System.out.println("开始视频通话");
        }
        @Override
        public void sendMsg(){
            super.sendMsg();
            System.out.println("wow,owo");
            System.out.println("发送有趣的图片~~~");
        }
        }
class Phone{
    public void call(){
        System.out.println("打电话~~~~");
    }
    public void sendMsg(){
        System.out.println("发送信息");
    }
}
