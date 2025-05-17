/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells
and carries the "instructions" for the development and functioning of living organisms.

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side.
DNA strand is never empty or there is no DNA at all (again, except for Haskell).

 */


package kyu7;

import java.util.HashMap;

public class ComplementaryDNA {
    public static void main(String[] args) {
        String dna_test = "TTTT";

        String out_s = makeComplement(dna_test);
        System.out.println(out_s);

    }


    public static String makeComplement(String dna) {

        HashMap<String, String> dna_mapping = new HashMap<String, String>();
        dna_mapping.put("C", "D");
        dna_mapping.put("A", "T");
        dna_mapping.put("D", "C");
        dna_mapping.put("T", "A");

        StringBuilder exit_str = new StringBuilder();

        for (char ch : dna.toCharArray()) {
            if (dna_mapping.containsKey(String.valueOf(ch))) {
                exit_str.append(dna_mapping.get(String.valueOf(ch)));
            } else {
                exit_str.append(ch);
            }
        }

        return exit_str.toString();

    }
}
//
//expected:<TAA[CG]> but was:<TAA[GD]>
//Stack Trace
//Completed in 2ms
//test03
//expected:<[C]ATA> but was:<[G]ATA>
