import polymorphism.cycle.Unicycle;
import polymorphism.polymorphicConstructors.RectangularGlyph;
import polymorphism.rodent.Gerbil;

public class ThinkingJavaMain {


    public static void main(String[] args){
//
//        EverythingIsAnObjectHelloData everythingIsAnObject = new EverythingIsAnObjectHelloData();
//       // everythingIsAnObject.ChapterExercises();
//
//
//
//        Dog dog = new Dog();
//       // dog.bark("Exercise 7 : bark synthesized constructor");
//
//       // InitializationAndCleanup.InitializationCleanupOverloadedMethods initCleanupOverloadedMethods = new InitializationAndCleanup.InitializationAndCleanup.InitializationCleanupOverloadedMethods(dog);
//
//        initCleanupOverloadedMethods.dogOverLoadedMethods();
//
//        AcessControl exercise1 = new AcessControl();
//
//        JavaAccessSpecifiers exercise4 = new JavaAccessSpecifiers();
//        //exercise4.exercise4NoAccessOutsideOfPackage(); do not have access

        Unicycle unicycle = new Unicycle(System.out);
        unicycle.drive(unicycle);

        RectangularGlyph rectangularGlyph = new RectangularGlyph(1, System.out);
        rectangularGlyph.draw();

        Gerbil gerbil = new Gerbil(System.out);
    }
}
