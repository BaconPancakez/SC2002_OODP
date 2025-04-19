public class Main {
        public static void main(String[] args) {
                // I
                ClassA a = new ClassB();
                ClassB b = (ClassB) a;
                b.method2(); // ClassB.method2
                b.method1(); // ClassA.method1

                // II
                // ClassA c = new ClassB();
                // ClassC d = (ClassC) c; // Runtime error here
                // d.method3(); // Never executed

                // III
                // ClassA e = new ClassC();
                // ClassB f = (ClassB) e;
                // f.method3(); // ClassC.method3
                // f.method2(); // ClassB.method2
                // f.method1(); // ClassA.method1

                // IV
                // ClassC g = (ClassC) new ClassA(); // Runtime error
                // g.method1(); // never executed
        }
}