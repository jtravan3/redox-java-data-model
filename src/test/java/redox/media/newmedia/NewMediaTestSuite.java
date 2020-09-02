package redox.media.newmedia;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import redox.clinicalsummary.patientquery.PatientQueryTest_Barbara;
import redox.clinicalsummary.patientquery.PatientQueryTest_Sample;
import redox.clinicalsummary.patientquery.PatientQueryTest_Walter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientQueryTest_Sample.class,
        PatientQueryTest_Barbara.class,
        PatientQueryTest_Walter.class})
public class NewMediaTestSuite {
}
