package redox.clinicalsummary.patientquery;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientQueryTest_Sample.class,
        PatientQueryTest_Barbara.class,
        PatientQueryTest_Walter.class})
public class PatientQueryTestSuite {
}
