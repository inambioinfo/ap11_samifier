package au.org.intersect.samifier.mascot;

import au.org.intersect.samifier.PeptideSearchResult;
import au.org.intersect.samifier.PeptideSequence;

/**
 * Created with IntelliJ IDEA.
 * User: diego
 * Date: 4/10/12
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PeptideSequenceGenerator
{
    public PeptideSequence getPeptideSequence(PeptideSearchResult peptideSearchResult) throws PeptideSequenceGeneratorException;
}