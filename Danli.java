import java.io.Serializable;

/**
 * @author shaox
 * @date 2023/4/9
 * @apiNote
 */
public class Danli implements Serializable {



    //单例可以通过 Unsafe 破坏 反射破坏  反序列化破坏
    private Danli() {
        System.out.println("创建单例");
    }
    private static Danli danli=new Danli();


    public static Danli getDanli() {
        return danli;
    }







}
