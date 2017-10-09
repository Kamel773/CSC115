public class MysteryTouch {
        public static void main(String[] args) {
            String head = "shoulders";
            String knees = "toes";
            String elbow = "head";
            String eye = "eyes and ears";
            String ear = "eye";
            touch(ear, elbow);
            touch(elbow, ear);
            touch(head, "elbow");
            touch(eye, eye);
            touch(knees, "Toes");
            touch(head, "knees " + knees);
        }
        public static void touch(String elbow, String ear) {
            System.out.println("touch your " + elbow+"toyour"+ear);
 }  
}
