import org.junit.Test;

import static org.junit.Assert.assertEquals;

        public class DartsTest {

            @Test
            public void testDartOutsideTarget() {
                NextdartTest darts = new NextdartTest();
                darts.nextdart(15.3, 13.2);
                assertEquals(0, darts.score());
                System.out.println("testDartOutsideTarget:"+darts.score());
            }

            @Test
            public void testDartintheOuterCircle() {
                NextdartTest darts = new NextdartTest();
                darts.nextdart(5.5, 9.1);
                assertEquals(1, darts.score());
                System.out.println("testDartintheOuterCircle:"+darts.score());
            }


            @Test
            public void testDartLandsOnMiddleOfCircle() {

                NextdartTest darts = new NextdartTest();
                darts.nextdart(3, 3.7);
                assertEquals(5, darts.score());
                System.out.println("testDartLandsOnMiddleOfCircle:"+darts.score());
            }



            @Test
            public void testDartLandsInTheInnerCircle() {
                NextdartTest darts = new NextdartTest();
                darts.nextdart(0, 0);
                assertEquals(10, darts.score());
                System.out.println("testDartLandsInTheInnerCircle:"+darts.score());
            }








        }


