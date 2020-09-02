package redox.clinicalsummary.patientqueryresponse;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientQueryResponseTest_Sample.class,
        PatientQueryResponseTest_Myra.class,
        PatientQueryResponseTest_Timothy.class})
public class PatientQueryResponseTestSuite {
}
