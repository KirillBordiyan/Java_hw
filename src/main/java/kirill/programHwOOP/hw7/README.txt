Точка входа: application/ProgramHw7.java

Паттерн проектирования использует Model & Controller (совмещен с View)
Выполнены SOLID принципы:
    -SRP (ComplexNumber, RegularNumber)
    -LSP, DIP(в контроллере создаются экз класса DefaultNumber,
          с использованием различных конструкторов классов, которые имплементируют данных интерфейс)
    -OCP - не выполнен (хотя можно было бы ComplexNumber наследовать от RegularNumber, просто с доп параметром мнимой части)
    -ISP - не выполнен (скорее всего, тк у сервисов отсутствуют различия в кол-ве и именовании методов,
                        выходит, что один интерфейс подходит для обоих вариантов)


Фабричный метод выполнен частично.
По-хорошему, часть методов в контроллере надо было вынести в отдельную папку factory, добавить туда интерфейс
и имплементировать им класс.
Тогда мы бы возвращали экземпляр класса ComplexNumber или RegularNumber и, подставив его в любой метод для обработки,
программа работала бы без ошибок (опять же выполнялся бы LSP).


Для корректной работы программы в pom.xml должны иметься следующие зависимости:
    //lombok
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.28</version>
        <scope>provided</scope>
    </dependency>

    //slf4j
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.7.32</version>
    </dependency>

    //logback
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.9</version>
    </dependency>


В папке resources должен быть файл logback.xml - инструкция для сохранения основной информации логов.
!Внимание!
Быть осторожным с полем в logback.xml: <file>src/main/java/kirill/programHwOOP/hw7/model/log/application.txt</file>
это ссылка текстового файла логов
для изменения места хранения менять ссылку на файл.