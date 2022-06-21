package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.123456788888; // explicita (CAST)
        System.out.println(b);

        //explicita (CAST) - neste caso quanto maior o numero mais se apoxima do positivo
        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        //explicita (CAST)
        double e = 1;
        int f = (int) e;
        System.out.println(f);

    }
}
