public class Basics {
    public static void main(String[] args) {
        // primitives are pass by value, don't get modified
        int x = 10;
        int y = 45;
        // objects are pass by reference and do get modified
        Foo foo = new Foo(3);

        System.out.println("X is " + x + " Y is + " + foo.num);

        modify(x, foo);

        System.out.println("X is " + x + " Y is + " + foo.num);


    }

    private static void modify(int x, Foo y) {
        x++;
        y.increment();
        System.out.println("X is " + x + " Y is + " + y.num);
    }

    private static class Foo {
        public int num;

        public Foo(int num) {
            this.num = num;
        }

        public void increment() {
            this.num++;
        }
    }
}

