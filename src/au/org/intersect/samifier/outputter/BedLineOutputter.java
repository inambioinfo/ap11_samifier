package au.org.intersect.samifier.outputter;

import au.org.intersect.samifier.PeptideSequence;

/**
 * Created with IntelliJ IDEA.
 * User: diego
 * Date: 10/10/12
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class BedLineOutputter
{
    private String chromosomeName;
    private int geneStart;
    private int geneStop;
    private String proteinName;

    public BedLineOutputter(PeptideSequence peptide, String proteinName)
    {
        this.chromosomeName = peptide.getGeneInfo().getChromosome();
        this.geneStart = peptide.getGeneInfo().getStart();
        this.geneStop = peptide.getGeneInfo().getStop();
        this.proteinName = proteinName;
    }

    @Override
    public String toString()
    {
        StringBuilder output = new StringBuilder();
        output.append(chromosomeName).append("\t");
        output.append(geneStart).append("\t");
        output.append(geneStop).append("\t");
        output.append(proteinName);
        output.append(System.getProperty("line.separator"));

        return output.toString();
    }


}