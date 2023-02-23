Feature: Athena Portal API Automation

  Scenario Outline: Login User
    Given Set endpoint and method and SampleName "<endpoint>" and "<Method>" and "<SampleName>"
    Then Verify Status code <Expected_status>
    Examples:
      | endpoint | Method | Expected_status | SampleName |
      | postApi  | post   | 200             | Login_cred |

  Scenario Outline: Invalid User Credential Login
    Given Set credential endpoint and method and SampleName "<endpoint>" and "<Method>" and "<SampleName>"
    Then Verify Status code <Expected_status>
    Examples:
      | endpoint | Method | Expected_status | SampleName        |
      | postApi  | post   | 400             | Invalidlogin_cred |
      | postApi  | post   | 400             | Incompletelogin_cred |

  Scenario Outline: Forgot Password
    Given Set email endpoint and method and samplename "<endpoint>" and "<Method>" and "<SampleName>"
    Then Verify Status code <Expected_status>
    Examples:
      | endpoint       | Method | Expected_status | SampleName      |
      | postForgotPass | post   | 200             | forgotpassEmail |

  Scenario Outline: Reset Password
    Given Authenticate endpoint and method and samplename "<endpoint>" and "<Method>" and "<SampleName>"
    Then Verify Status code <Expected_status>
    Examples:
      | endpoint      | Method | Expected_status | SampleName |
      | putUpdatePass | put   | 200             | ResetPass  |