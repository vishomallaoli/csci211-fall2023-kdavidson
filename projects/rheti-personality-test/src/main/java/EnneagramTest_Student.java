import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class EnneagramTest_Student {
    @Test
    void testProcessResults1() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_three.csv");
        evaluator.processResults();
        assertEquals("Davidson B A D H F B D F I E H D C I D G A C B F C H B I D A B H F D C H E D F C \n" +
                "Student1 E A D H E B G H I E H B C E D B A E B D C A F G E I C H F D A H E A F H \n" +
                "Student2 E G C H E A G H C A G B F I H G F C B D G H B G E A B H G D A H G A F C \n", evaluator.printResults(0, 2));
    }

    @Test
    void testProcessResults4() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        assertEquals("Chamulak_H B G C I E A G H C A H B C I H B A C I D G H B I E A B H G D A H G D F H \n" +
                "Krass-Knap_A E A C I F A G H I E H B F E D B A E I D C A F I D A B H F D C H G D I C \n" +
                "Hipskind_A B G D H E A D F I A H B C I H B A C I D G H B G E A B H F D A B E A F C \n" +
                "Britt_A B A D H E A G H C E G D C I D G A C I D G H B I D A C E G D A H G D I H \n" +
                "Sharp_A B A C H F B G H I A H B C E D B A C B F C H B G D A B H G D C H E A I H \n" +
                "Njiti_A B A D H E A D H I E H B C E H B A E B D C A F I E A B H F D A B E A F H \n" +
                "Le_B B A C I F B D F I A H B F E H B A E B F C A F G D I B H F I C H E A F C \n" +
                "Williams_B B A C H F A D F I A H D C I H B F C B F C A F G E I B H F D C H G D F C \n" +
                "Gomez_C E A D I F A G H C A H B C I H B F C B F G A B I E I C E F I A H E A I C \n" +
                "Ross_C B A D H F A D F I A H B C E H B A C B F C H B I E A B H F D A B E A F C \n" +
                "Glynn_D B A D H E B D H C E G B C I D G A E B F G H F G E A C E F D C B G D F H \n" +
                "White_D B G C I E A D H C A G B F E H B A C B D G H B I E A B E G D A H E A F C \n" +
                "Wright_D B G D I E B D H I A H B F I H B A C B D C H F G E A C H G I C H G D I H \n" +
                "Haggard_E E G D H E B D F I E H D F I H B F C B F C H B I D I B E G D C B E D I H \n" +
                "Ross_E B A D H E A D H C E H B C E D B A C B D C A B I E I C H F D A B E A F H \n" +
                "Earnest_J E G C I F B D F C A H D F E H B F C B D C A F I E A B H F D C H E A I C \n" +
                "Drye_E E G C H F A G F C A H B C E H B A C B F C A B I D A B E F I A B E A F C \n" +
                "Ortiz_E B A C I E A G H I E H D F E H G A E B D C A B G E I C H G D C H E A F H \n" +
                "Miceli_F E A D I E B G F I A H B F E H B A E B F C A F G D I B H F D A B E A F H \n" +
                "Bahro_F B A C H F B G F C E H B F E H B A C B F G A F I E A B E F D C H E A I C \n" +
                "Belal_F E G C I F A G F C E H B F E H B F E I F C A F I D I B E F I A H G A I C \n" +
                "Bradham_G E G D I F A G F I E G D C I H B A C I D C A B I D I C E F I C B G D I C \n" +
                "Delp_G B G D I E A D H I A H D C I H G F C B D C H B I D A B H F D C H G D F C \n" +
                "Wade_G B A D H E A D F C E H B C E H B F E B D C H B G E I C H G D C B G A F H \n" +
                "Tra_H E G C I F A D H C A H D C I D G F C I F C A B I D A B E G D A B G A I C \n" +
                "Nguyen_H E A C I F A G F I E H B C E H B A E B F C H F G E I B E F D C H E A F H \n" +
                "Cao_I B A C H F A D H C E H B C E D B A C B D C H F G E A C H F D A H E A F H \n" +
                "Hossain_I E A C H E A D F C A H B C I D G A C B D G H B I E I B E G D C H G D F H \n" +
                "Converse_J B G D H E A D F C A H B F I D G F C B D C H B G E A C E G D C H G D F C \n" +
                "Cowsert_J B G C H F A G H C E H B C I H B A C I D G H B G D A B H G I A H G D I H \n" +
                "Jones_J E A C I F A D H C E G B C I D B A E B D C A B G D A B E F I C H E A F C \n" +
                "Moncada_J B A D I E A G F I A H B F E H B A C I F C A F I E I C E G I C B E A I H \n" +
                "Kim_J B A D I F B G F C A H B F I H B A E B F G A B I E I B H F D A B E A I H \n" +
                "Jacob_W B A D I F B D F I E H B C E D B A C B D G A B I E I C H F D C B G D I C \n" +
                "Saloni_J B A C H F A D F I A G B C E D B F C B F C H F I E A B H F I C H G A F H \n" +
                "Peterson_J B G D I F B D F C E H B C I H B F E I F C H B I D A B H G I C H G A I H \n" +
                "Beecham_J E A D H F A G F C A H B F E D B A C B F C A F I D I B H F D A B E A F H \n" +
                "Brassell_K E A D I E A G H I E H B C E H B A C I D G H B I D A B H G D A H E D I H \n" +
                "Greene_K B A D H E A D H C E H D C I D B A C B D G H B G E A C H F D C B G D I C \n" +
                "Brown_K E G D H F A D H C E H B C I H B F C I D C H B I D A B H F I C H G D I C \n" +
                "Cao_K E A D I E A D F I E H B F E D B A E B F C A F I D I C E F D C B E A F C \n" +
                "Leatherwood_L E A D I E A D F I A H B F E H B F E B F C H F G D I B E G D C H E A F C \n" +
                "Smith_M B A C H E B D F C E H B F E H B A C B F C A B I E A B E G I A H G A I C \n" +
                "Iqbal_M E A D I F B D H C E H D C I D B A C B F C H B G E A C H F I C H E A I C \n" +
                "Houlihan_M B A C H F B D F C A G D C I D G F C B D C H B G E I B H F I A H G D F H \n" +
                "Yarbrough_M B A D I E A D F I A H B F E H B A C B F C A F I D I B H F D A B E A F H \n" +
                "Denton_M B A D H E B G H C E H B C I D B F C B D C H F I D I C H F D A H E A I H \n" +
                "Miller_N E A D H F A D H I E H B C E H B F C B F G A F G E I C H F D A B G A F C \n" +
                "Langendoen_K B A C I F A D H I A H B C E D B A C B D G H F I D A C H F D A B E A F C \n" +
                "Brady_N E A C H E A D H C E H B C I D G F C B D G H B G E A C H F D C H G D I H \n" +
                "Hargette_P E A C I F A D F I A H D F E H B A C B F C A F I E I B H F I A H E A I C \n" +
                "Shrestha_P B A D I F B D F I A H B F E H B F C B F C A F I D I B E F D A B E A F H \n" +
                "Myres_R B A C I F A D H I A H B F E H B A C B F G A F I E A C H G I A B E A I C \n" +
                "Yates_S B A C I F A D F I A H B F E H B F C I F C A F G E A C H F I C B E A I C \n" +
                "Larson_T B A D H E A D H I E H B C E H B F C B D C A F I E A C H F D A H E A F H \n" +
                "Tran_T B A D I E A G H I E H D C I D B F C I D C A F G D I B H G D C H E D I C \n" +
                "Skipworth_T B A D H E A D H I E H B C E D B F C B D C A B G D A C H F D A B G A F H \n" +
                "Malla oli_V B G D H F B G H C E G D C I D G F C I D G H B G D I B H G I C H G D I C \n" +
                "Zhou_Y E A D I E A D H C E H B C E D B A C B F C A F I D A B H F D C H G D F C \n" +
                "Bryan_N B A C I F B D H I A H B F E H B A C B F C A F G E A C H F D A B E A I C \n" +
                "Bufkin_H B A D H F B G H I E H B C E H B A C I D G A F I E I B H G D C B E A F H \n" +
                "Carrigee_B B A C I E A D F I A H B C E H B A C B F C A F I E A B H F D A H E A F H \n" +
                "DuCharme_C E G C I F B G F C E G B F E H B A E I F C A F I D A C H F I A B E A I C \n" +
                "Hidrobo_S E A D I F A G F I A H B F E D B A E B F C A F I D I B H F D A B E A F H \n" +
                "Jung_C E A C I F A G F C E G B F I H B A C I F C H F G E I C H G I A H G A I C \n" +
                "Davidson_K B A D H F B D F I E H D C I D G A C B F C H B I D A B H F D C H E D F C \n" +
                "Kersting_W B A D I F A D F I A H B F E H B A C B F G A F G E I B H F D A H E A I C \n" +
                "Kuchta_K B A C H F A D H I E H B C E H B A C B F C H B I E A B H G D C H E A I H \n" +
                "Lombard_S E G D I F A G F I A H D F I H B A C I D G H F I D A B H G I A H G A I C \n" +
                "McLaughlin_J B A D H F A D H C E H D C I H B A C B F C A F I E A C H F I C H E D I C \n" +
                "O'Sullivan_C B A C I F B D H I E H D C E H B A C I D C A B I E I B H F I A H G A F H \n" +
                "Popple_L B A C H F B D F I A H B F E D B F E B F C A F I D I B H F D C B E A I C \n" +
                "Garcia_G B A C I F A G H I A G B F E H B F E I F G A F G D A B H F D A H E A I C \n" +
                "Lim_K E G C I F A D F I A H B C I D G A C B F C A F I E A B E F D A H E A I H \n" +
                "Hightower_Z E A D H E B D F C E G D C I H G A E B D C A F G D A C E F I C B E D F H \n", evaluator.printResults(0, 74));
    }


    @Test
    public void testProcessResults6() throws FileNotFoundException {
        assertThrows(InvalidEnneagramException.class, () -> {
            Enneagram evaluator = new Enneagram("src/error1.csv");
            evaluator.processResults();
        });
    }

    @Test
    void testcountTraits1() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_three.csv");
        evaluator.processResults();
        assertEquals("Davidson: A=3 B=5 C=5 D=7 E=2 F=5 G=1 H=5 I=3\n" +
                "Student1: A=5 B=4 C=3 D=4 E=7 F=3 G=2 H=6 I=2\n" +
                "Student2: A=5 B=4 C=4 D=2 E=3 F=3 G=8 H=6 I=1\n", evaluator.countTraits(0, 2));
    }

     @Test
    void testcountTraits4() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_ten.csv");
        evaluator.processResults();
        assertEquals("Student4: A=3 B=6 C=3 D=3 E=5 F=3 G=4 H=3 I=6\n", evaluator.countTraits(4, 4));
    }

    @Test
    void testcountTraits6() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        assertEquals("Tran_T: A=3 B=3 C=5 D=7 E=3 F=2 G=3 H=4 I=6\n" +
                "Skipworth_T: A=6 B=6 C=4 D=6 E=3 F=3 G=2 H=5 I=1\n" +
                "Malla oli_V: A=0 B=4 C=5 D=6 E=1 F=2 G=8 H=5 I=5\n" +
                "Zhou_Y: A=5 B=4 C=6 D=6 E=4 F=4 G=1 H=4 I=2\n" +
                "Bryan_N: A=7 B=6 C=5 D=2 E=3 F=5 G=1 H=4 I=3\n" +
                "Bufkin_H: A=4 B=6 C=3 D=3 E=4 F=3 G=3 H=6 I=4\n" +
                "Carrigee_B: A=8 B=5 C=4 D=2 E=4 F=5 G=0 H=5 I=3\n" +
                "DuCharme_C: A=5 B=4 C=5 D=1 E=5 F=6 G=3 H=2 I=5\n" +
                "Hidrobo_S: A=7 B=5 C=1 D=4 E=4 F=7 G=1 H=3 I=4\n" +
                "Jung_C: A=5 B=2 C=6 D=0 E=3 F=5 G=5 H=4 I=6\n" +
                "Davidson_K: A=3 B=5 C=5 D=7 E=2 F=5 G=1 H=5 I=3\n" +
                "Kersting_W: A=7 B=5 C=2 D=3 E=3 F=6 G=2 H=4 I=4\n" +
                "Kuchta_K: A=5 B=6 C=5 D=2 E=4 F=2 G=1 H=8 I=3\n" +
                "Lombard_S: A=6 B=2 C=2 D=4 E=1 F=4 G=5 H=5 I=7\n" +
                "McLaughlin_J: A=5 B=3 C=7 D=4 E=3 F=4 G=0 H=6 I=4\n" +
                "O'Sullivan_C: A=5 B=5 C=4 D=3 E=3 F=3 G=1 H=6 I=6\n" +
                "Popple_L: A=4 B=7 C=4 D=4 E=3 F=7 G=0 H=3 I=4\n" +
                "Garcia_G: A=7 B=4 C=2 D=2 E=3 F=6 G=4 H=4 I=4\n" +
                "Lim_K: A=7 B=3 C=4 D=3 E=4 F=5 G=2 H=3 I=5\n" +
                "Hightower_Z: A=4 B=3 C=5 D=6 E=6 F=4 G=3 H=3 I=2\n", evaluator.countTraits(55, 74));
    }

    @Test
    void testpersonalityTypes1() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_three.csv");
        evaluator.processResults();
        assertEquals("Davidson: 1 \n" +
                "Student1: 4 \n" +
                "Student2: 8 \n", evaluator.personalityTypes(0, 2));
    }
    @Test
    void testpersonalityTypes4() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        assertEquals("Chamulak_H: 5 \n" +
                "Krass-Knap_A: 9 1 7 \n" +
                "Hipskind_A: 9 6 \n" +
                "Britt_A: 1 \n" +
                "Sharp_A: 6 5 \n" +
                "Njiti_A: 9 \n" +
                "Le_B: 2 \n" +
                "Williams_B: 2 \n" +
                "Gomez_C: 9 7 \n" +
                "Ross_C: 9 6 \n" +
                "Glynn_D: 6 1 4 8 \n" +
                "White_D: 9 6 \n" +
                "Wright_D: 5 \n" +
                "Haggard_E: 6 1 \n" +
                "Ross_E: 9 6 \n" +
                "Earnest_J: 3 2 \n" +
                "Drye_E: 9 \n" +
                "Ortiz_E: 4 5 \n" +
                "Miceli_F: 9 6 2 \n" +
                "Bahro_F: 6 2 \n" +
                "Belal_F: 2 \n" +
                "Bradham_G: 7 \n" +
                "Delp_G: 1 \n" +
                "Wade_G: 6 5 \n" +
                "Tra_H: 9 3 \n" +
                "Nguyen_H: 4 \n" +
                "Cao_I: 5 \n" +
                "Hossain_I: 3 1 5 \n" +
                "Converse_J: 3 1 \n" +
                "Cowsert_J: 5 \n" +
                "Jones_J: 9 3 \n" +
                "Moncada_J: 7 \n" +
                "Kim_J: 6 \n" +
                "Jacob_W: 6 \n" +
                "Saloni_J: 2 \n" +
                "Peterson_J: 6 5 7 \n" +
                "Beecham_J: 9 2 \n" +
                "Brassell_K: 5 \n" +
                "Greene_K: 1 \n" +
                "Brown_K: 5 \n" +
                "Cao_K: 4 \n" +
                "Leatherwood_L: 4 2 \n" +
                "Smith_M: 6 \n" +
                "Iqbal_M: 3 \n" +
                "Houlihan_M: 6 3 1 2 5 \n" +
                "Yarbrough_M: 9 \n" +
                "Denton_M: 5 \n" +
                "Miller_N: 2 \n" +
                "Langendoen_K: 9 \n" +
                "Brady_N: 5 \n" +
                "Hargette_P: 9 \n" +
                "Shrestha_P: 2 \n" +
                "Myres_R: 9 \n" +
                "Yates_S: 2 \n" +
                "Larson_T: 5 \n" +
                "Tran_T: 1 \n" +
                "Skipworth_T: 9 6 1 \n" +
                "Malla oli_V: 8 \n" +
                "Zhou_Y: 3 1 \n" +
                "Bryan_N: 9 \n" +
                "Bufkin_H: 6 5 \n" +
                "Carrigee_B: 9 \n" +
                "DuCharme_C: 2 \n" +
                "Hidrobo_S: 9 2 \n" +
                "Jung_C: 3 7 \n" +
                "Davidson_K: 1 \n" +
                "Kersting_W: 9 \n" +
                "Kuchta_K: 5 \n" +
                "Lombard_S: 7 \n" +
                "McLaughlin_J: 3 \n" +
                "O'Sullivan_C: 5 7 \n" +
                "Popple_L: 6 2 \n" +
                "Garcia_G: 9 \n" +
                "Lim_K: 9 \n" +
                "Hightower_Z: 1 4 \n", evaluator.personalityTypes(0, 74));
    }

    @Test
    void testpersonalityTypes6() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_three.csv");
        evaluator.processResults();
        evaluator.personalityTypes(0, 2);
        assertEquals("Davidson B A D H F B D F I E H D C I D G A C B F C H B I D A B H F D C H E D F C 1 \n" +
                "Student1 E A D H E B G H I E H B C E D B A E B D C A F G E I C H F D A H E A F H 4 \n" +
                "Student2 E G C H E A G H C A G B F I H G F C B D G H B G E A B H G D A H G A F C 8 \n", evaluator.printResults(0, 2));
    }

    @Test
    void testpersonalityTypes9() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        evaluator.personalityTypes(0, 74);
        assertEquals("Chamulak_H B G C I E A G H C A H B C I H B A C I D G H B I E A B H G D A H G D F H 5 \n" +
                "Krass-Knap_A E A C I F A G H I E H B F E D B A E I D C A F I D A B H F D C H G D I C 9 1 7 \n" +
                "Hipskind_A B G D H E A D F I A H B C I H B A C I D G H B G E A B H F D A B E A F C 9 6 \n" +
                "Britt_A B A D H E A G H C E G D C I D G A C I D G H B I D A C E G D A H G D I H 1 \n" +
                "Sharp_A B A C H F B G H I A H B C E D B A C B F C H B G D A B H G D C H E A I H 6 5 \n" +
                "Njiti_A B A D H E A D H I E H B C E H B A E B D C A F I E A B H F D A B E A F H 9 \n" +
                "Le_B B A C I F B D F I A H B F E H B A E B F C A F G D I B H F I C H E A F C 2 \n" +
                "Williams_B B A C H F A D F I A H D C I H B F C B F C A F G E I B H F D C H G D F C 2 \n" +
                "Gomez_C E A D I F A G H C A H B C I H B F C B F G A B I E I C E F I A H E A I C 9 7 \n" +
                "Ross_C B A D H F A D F I A H B C E H B A C B F C H B I E A B H F D A B E A F C 9 6 \n" +
                "Glynn_D B A D H E B D H C E G B C I D G A E B F G H F G E A C E F D C B G D F H 6 1 4 8 \n" +
                "White_D B G C I E A D H C A G B F E H B A C B D G H B I E A B E G D A H E A F C 9 6 \n" +
                "Wright_D B G D I E B D H I A H B F I H B A C B D C H F G E A C H G I C H G D I H 5 \n" +
                "Haggard_E E G D H E B D F I E H D F I H B F C B F C H B I D I B E G D C B E D I H 6 1 \n" +
                "Ross_E B A D H E A D H C E H B C E D B A C B D C A B I E I C H F D A B E A F H 9 6 \n" +
                "Earnest_J E G C I F B D F C A H D F E H B F C B D C A F I E A B H F D C H E A I C 3 2 \n" +
                "Drye_E E G C H F A G F C A H B C E H B A C B F C A B I D A B E F I A B E A F C 9 \n" +
                "Ortiz_E B A C I E A G H I E H D F E H G A E B D C A B G E I C H G D C H E A F H 4 5 \n" +
                "Miceli_F E A D I E B G F I A H B F E H B A E B F C A F G D I B H F D A B E A F H 9 6 2 \n" +
                "Bahro_F B A C H F B G F C E H B F E H B A C B F G A F I E A B E F D C H E A I C 6 2 \n" +
                "Belal_F E G C I F A G F C E H B F E H B F E I F C A F I D I B E F I A H G A I C 2 \n" +
                "Bradham_G E G D I F A G F I E G D C I H B A C I D C A B I D I C E F I C B G D I C 7 \n" +
                "Delp_G B G D I E A D H I A H D C I H G F C B D C H B I D A B H F D C H G D F C 1 \n" +
                "Wade_G B A D H E A D F C E H B C E H B F E B D C H B G E I C H G D C B G A F H 6 5 \n" +
                "Tra_H E G C I F A D H C A H D C I D G F C I F C A B I D A B E G D A B G A I C 9 3 \n" +
                "Nguyen_H E A C I F A G F I E H B C E H B A E B F C H F G E I B E F D C H E A F H 4 \n" +
                "Cao_I B A C H F A D H C E H B C E D B A C B D C H F G E A C H F D A H E A F H 5 \n" +
                "Hossain_I E A C H E A D F C A H B C I D G A C B D G H B I E I B E G D C H G D F H 3 1 5 \n" +
                "Converse_J B G D H E A D F C A H B F I D G F C B D C H B G E A C E G D C H G D F C 3 1 \n" +
                "Cowsert_J B G C H F A G H C E H B C I H B A C I D G H B G D A B H G I A H G D I H 5 \n" +
                "Jones_J E A C I F A D H C E G B C I D B A E B D C A B G D A B E F I C H E A F C 9 3 \n" +
                "Moncada_J B A D I E A G F I A H B F E H B A C I F C A F I E I C E G I C B E A I H 7 \n" +
                "Kim_J B A D I F B G F C A H B F I H B A E B F G A B I E I B H F D A B E A I H 6 \n" +
                "Jacob_W B A D I F B D F I E H B C E D B A C B D G A B I E I C H F D C B G D I C 6 \n" +
                "Saloni_J B A C H F A D F I A G B C E D B F C B F C H F I E A B H F I C H G A F H 2 \n" +
                "Peterson_J B G D I F B D F C E H B C I H B F E I F C H B I D A B H G I C H G A I H 6 5 7 \n" +
                "Beecham_J E A D H F A G F C A H B F E D B A C B F C A F I D I B H F D A B E A F H 9 2 \n" +
                "Brassell_K E A D I E A G H I E H B C E H B A C I D G H B I D A B H G D A H E D I H 5 \n" +
                "Greene_K B A D H E A D H C E H D C I D B A C B D G H B G E A C H F D C B G D I C 1 \n" +
                "Brown_K E G D H F A D H C E H B C I H B F C I D C H B I D A B H F I C H G D I C 5 \n" +
                "Cao_K E A D I E A D F I E H B F E D B A E B F C A F I D I C E F D C B E A F C 4 \n" +
                "Leatherwood_L E A D I E A D F I A H B F E H B F E B F C H F G D I B E G D C H E A F C 4 2 \n" +
                "Smith_M B A C H E B D F C E H B F E H B A C B F C A B I E A B E G I A H G A I C 6 \n" +
                "Iqbal_M E A D I F B D H C E H D C I D B A C B F C H B G E A C H F I C H E A I C 3 \n" +
                "Houlihan_M B A C H F B D F C A G D C I D G F C B D C H B G E I B H F I A H G D F H 6 3 1 2 5 \n" +
                "Yarbrough_M B A D I E A D F I A H B F E H B A C B F C A F I D I B H F D A B E A F H 9 \n" +
                "Denton_M B A D H E B G H C E H B C I D B F C B D C H F I D I C H F D A H E A I H 5 \n" +
                "Miller_N E A D H F A D H I E H B C E H B F C B F G A F G E I C H F D A B G A F C 2 \n" +
                "Langendoen_K B A C I F A D H I A H B C E D B A C B D G H F I D A C H F D A B E A F C 9 \n" +
                "Brady_N E A C H E A D H C E H B C I D G F C B D G H B G E A C H F D C H G D I H 5 \n" +
                "Hargette_P E A C I F A D F I A H D F E H B A C B F C A F I E I B H F I A H E A I C 9 \n" +
                "Shrestha_P B A D I F B D F I A H B F E H B F C B F C A F I D I B E F D A B E A F H 2 \n" +
                "Myres_R B A C I F A D H I A H B F E H B A C B F G A F I E A C H G I A B E A I C 9 \n" +
                "Yates_S B A C I F A D F I A H B F E H B F C I F C A F G E A C H F I C B E A I C 2 \n" +
                "Larson_T B A D H E A D H I E H B C E H B F C B D C A F I E A C H F D A H E A F H 5 \n" +
                "Tran_T B A D I E A G H I E H D C I D B F C I D C A F G D I B H G D C H E D I C 1 \n" +
                "Skipworth_T B A D H E A D H I E H B C E D B F C B D C A B G D A C H F D A B G A F H 9 6 1 \n" +
                "Malla oli_V B G D H F B G H C E G D C I D G F C I D G H B G D I B H G I C H G D I C 8 \n" +
                "Zhou_Y E A D I E A D H C E H B C E D B A C B F C A F I D A B H F D C H G D F C 3 1 \n" +
                "Bryan_N B A C I F B D H I A H B F E H B A C B F C A F G E A C H F D A B E A I C 9 \n" +
                "Bufkin_H B A D H F B G H I E H B C E H B A C I D G A F I E I B H G D C B E A F H 6 5 \n" +
                "Carrigee_B B A C I E A D F I A H B C E H B A C B F C A F I E A B H F D A H E A F H 9 \n" +
                "DuCharme_C E G C I F B G F C E G B F E H B A E I F C A F I D A C H F I A B E A I C 2 \n" +
                "Hidrobo_S E A D I F A G F I A H B F E D B A E B F C A F I D I B H F D A B E A F H 9 2 \n" +
                "Jung_C E A C I F A G F C E G B F I H B A C I F C H F G E I C H G I A H G A I C 3 7 \n" +
                "Davidson_K B A D H F B D F I E H D C I D G A C B F C H B I D A B H F D C H E D F C 1 \n" +
                "Kersting_W B A D I F A D F I A H B F E H B A C B F G A F G E I B H F D A H E A I C 9 \n" +
                "Kuchta_K B A C H F A D H I E H B C E H B A C B F C H B I E A B H G D C H E A I H 5 \n" +
                "Lombard_S E G D I F A G F I A H D F I H B A C I D G H F I D A B H G I A H G A I C 7 \n" +
                "McLaughlin_J B A D H F A D H C E H D C I H B A C B F C A F I E A C H F I C H E D I C 3 \n" +
                "O'Sullivan_C B A C I F B D H I E H D C E H B A C I D C A B I E I B H F I A H G A F H 5 7 \n" +
                "Popple_L B A C H F B D F I A H B F E D B F E B F C A F I D I B H F D C B E A I C 6 2 \n" +
                "Garcia_G B A C I F A G H I A G B F E H B F E I F G A F G D A B H F D A H E A I C 9 \n" +
                "Lim_K E G C I F A D F I A H B C I D G A C B F C A F I E A B E F D A H E A I H 9 \n" +
                "Hightower_Z E A D H E B D F C E G D C I H G A E B D C A F G D A C E F I C B E D F H 1 4 \n", evaluator.printResults(0, 74));
    }

    @Test
    void testcountClass1() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_three.csv");
        evaluator.processResults();
        int [] temp = evaluator.countClass(0, 2);
        String output = "";
        for(int i = 1; i < temp.length; i++) {
            System.out.println(temp[i]);
            output += i + ": " + temp[i] + "\n";
        }
        assertEquals("1: 1\n" +
                "2: 0\n" +
                "3: 0\n" +
                "4: 1\n" +
                "5: 0\n" +
                "6: 0\n" +
                "7: 0\n" +
                "8: 1\n" +
                "9: 0\n", output);
    }

    @Test
    void testcountClass4() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        int [] temp = evaluator.countClass(0, 74);
        String output = "";
        for(int i = 1; i < temp.length; i++) {
            System.out.println(temp[i]);
            output += i + ": " + temp[i] + "\n";
        }
        assertEquals("1: 14\n" +
                "2: 16\n" +
                "3: 10\n" +
                "4: 6\n" +
                "5: 18\n" +
                "6: 18\n" +
                "7: 8\n" +
                "8: 2\n" +
                "9: 23\n", output);
    }

    @Test
    void testcountClass5() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        int [] temp = evaluator.countClass(61, 74);
        String output = "";
        for(int i = 1; i < temp.length; i++) {
            System.out.println(temp[i]);
            output += i + ": " + temp[i] + "\n";
        }
        assertEquals("1: 2\n" +
                "2: 3\n" +
                "3: 2\n" +
                "4: 1\n" +
                "5: 2\n" +
                "6: 1\n" +
                "7: 3\n" +
                "8: 0\n" +
                "9: 5\n", output);
    }

    @Test
    void testMostCommonType1() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data_three.csv");
        evaluator.processResults();
        assertEquals("1 4 8 ", evaluator.mostCommonType(0, 2));
    }



    @Test
    void testMostCommonType5() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        assertEquals("9 ", evaluator.mostCommonType(0, 74));
    }

    @Test
    void testMostCommonType6() throws FileNotFoundException {
        Enneagram evaluator = new Enneagram("src/RHETI_Data.csv");
        evaluator.processResults();
        assertEquals("6 9 ", evaluator.mostCommonType(0, 15));
    }

}