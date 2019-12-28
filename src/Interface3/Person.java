package Interface3;

/*
 * 可单独输出一个接口，继承其他多个父接口，
 * 进而其他调用/继承Person时，同时具有Cooker, NurseSer, TakeCarSer
 */

//interface 定义接口
//Person继承三个类
public interface Person extends Cooker, NurseSer, TakeCarSer {

}
