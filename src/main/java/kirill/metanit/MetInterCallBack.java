package kirill.metanit;

//интерфейсы в механизме обратного вызова
//суть в том, что одни действия вызывают другие действия
//как кнопка и счетчик и пр


public class MetInterCallBack {
    public static void main(String[] args) {
        Button btn = new Button(new ButtonClicker());
        btn.click();
        btn.click();
        btn.click();
        btn.click();
        btn.click();
        btn.click();
    }
}

//класс Button принимает объект интерфейса EventHandler
//после конструктора описан метод click(), который вызывает метод execute() этого объекта
//далее в классе ButtonClicker реализуется метод execute().
//в main создается объект Button, который в конструктор принимаем объект класса ButtonClicker (у него как раз реализовано нажатие).
//получается, создается btn, который может использовать внутренний метод click(), который описывает методы объекта ButtonClicker
//в котором уже непосредственно описана реализация метода из используемого интерфейса

//в click уже передан объект ButtonClicker, из которого берется реализация вызываемого метода
//выходит метод метода из интерфейса или типа того

interface  EventHandler{
    void execute();
}
class ButtonClicker implements  EventHandler{
    public void execute(){
        System.out.println("нажал");
    }
}

class Button{
    EventHandler handler;
    Button(EventHandler action){
        this.handler = action;
    }

    public void click(){
        handler.execute();
    }
}
