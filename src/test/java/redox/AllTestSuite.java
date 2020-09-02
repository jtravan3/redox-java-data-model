package redox;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import redox.clinicalsummary.patientpush.PatientPushTestSuite;
import redox.clinicalsummary.patientquery.PatientQueryTestSuite;
import redox.clinicalsummary.patientqueryresponse.PatientQueryResponseTestSuite;
import redox.media.newmedia.NewMediaTestSuite;
import redox.media.replace.ReplaceTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientPushTestSuite.class,
        PatientQueryTestSuite.class,
        PatientQueryResponseTestSuite.class,
        ReplaceTestSuite.class,
        NewMediaTestSuite.class})
public class AllTestSuite {
}