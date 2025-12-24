
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is on the Profile section

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | valid_profile_file |
      | valid_file.pdf     |
      | valid_file.docx    |

  @multiple-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects the "<profile_file>" file
    And the user clicks on the Upload button
    Then the user should see a confirmation message for the first profile upload
    And the upload icon remains functional after the first upload
    When the user clicks on the upload icon
    And the user browses and selects the "<profile_file>" file
    And the user clicks on the Upload button
    Then the user should see a confirmation message for the second profile upload

    Examples:
      | profile_file         |
      | ValidCandidateOne.pdf |
      | ValidCandidateTwo.pdf |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid profile file of 2MB
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message

  Examples:
    | file_size |
    | 2MB       |

  @valid-upload-long-filename
  Scenario Outline: Upload New Candidate Profile
    When I click on the upload (cloud) icon
    And I browse and select a valid profile file named "<filename>"
    And I click on the Upload button
    Then I wait for the upload process to complete
    And I observe the system's response
    Then I should see a success confirmation message displayed to the user

    Examples:
      | filename                                                                           |
      | This_is_a_very_long_filename_for_a_candidate_profile_that_exceeds_normal_length.pdf |

  @valid-file-upload
  Scenario Outline: Upload New Candidate Profile
    When the admin clicks on the upload (cloud) icon
    And the admin browses and selects a valid "<file_format>" profile file
    And the admin clicks on the Upload button
    And the admin waits for the upload process to complete
    Then a success confirmation message is displayed for the "<file_format>" file uploaded

    Examples:
      | file_format |
      | PDF         |
      | DOCX        |
      | TXT         |

  @upload-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | profile_file        |
      | valid_profile.pdf   |

  @successful_upload
  Scenario Outline: Upload New Candidate Profile
    When I click on the upload (cloud) icon
    And I browse and select a valid profile file
    And I click on the Upload button
    And I wait for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | file_type |
      | DOCX      |

@upload_chrome
Scenario Outline: Upload New Candidate Profile in <browser>
  When the user navigates to the Profile section from the side navigation
  And the user clicks on the upload icon
  And the user browses and selects a valid profile file
  And the user clicks on the Upload button
  Then the user should wait for the upload process to complete
  And the user should see a success confirmation message

Examples:
  | browser  |
  | Chrome   |
  | Firefox  |
  | Safari   |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid profile file named "<filename>"
  And the user clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed to the user

  Examples:
    | filename                         |
    | Profile_Candidate_JohnDoe_2023.pdf |

  @unsupported-file-upload
  Scenario Outline: Upload New Candidate Profile with Unsupported File Type
    When the user clicks on the upload (cloud) icon
    And the user browses and selects an unsupported file type <unsupported_file_type>
    And the user clicks on the Upload button
    Then an error message is displayed indicating the file type is not supported

    Examples:
      | unsupported_file_type |
      | .exe                  |

  @error-message-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user leaves the file selection dialog empty
    And the user clicks on the Upload button
    Then an error message is displayed indicating that a file must be selected

    Examples:
      |   |
      |   |

@file_size_exceed
Scenario Outline: Upload New Candidate Profile
  Given the user clicks on the upload icon
  When the user browses and selects a file larger than <file_size>
  And the user clicks on the Upload button
  Then an error message is displayed indicating that the file size exceeds the limit

Examples:
  | file_size |
  | 6MB       |

@corrupted-file-upload
Scenario Outline: Upload New Candidate Profile
  Given the user is on the Profile section
  When the user clicks on the upload icon
  And the user browses and selects a corrupted profile file
  And the user clicks on the Upload button
  Then an error message is displayed indicating that the file is corrupted and cannot be uploaded

  Examples:
    | corrupted_file |
    | corrupted_file.txt |

@no-internet-upload
Scenario Outline: Upload New Candidate Profile
  Given the user is in the Profile section
  When the user clicks on the upload icon
  And the user browses and selects a valid profile file
  And the user disconnects the internet connection
  And the user clicks on the Upload button
  Then an error message is displayed indicating that the upload cannot proceed due to no internet connection

  Examples:
    |   |
    |   |

@invalid-file-upload
Scenario Outline: Upload New Candidate Profile
  Given the user is on the Profile section
  When the user clicks on the upload icon
  And the user browses and selects a blank profile file
  And the user clicks on the Upload button
  Then the user should see an error message indicating that the file content is invalid

  Examples:
    | <file>               |
    | blank_profile_file   |

@invalid-file-upload
Scenario Outline: Upload New Candidate Profile
  Given the upload icon is visible and clickable
  When the user clicks on the upload icon
  And the user browses and selects a file without an extension
  And the user clicks on the Upload button
  Then the system displays an error message indicating that the file must have a valid extension

  Examples:
    | file_name         |
    | CandidateProfile   |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid profile file named "<filename>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message

    Examples:
      | filename                       |
      | Candidate_@2023_Profile.pdf   |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects the valid profile file named <filename>
    And the user clicks the Upload button
    Then the upload process should complete
    And a success confirmation message should be displayed to the user

    Examples:
      | filename |
      | A.pdf    |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    Given the user navigates to the Profile section from the side navigation
    When the user clicks on the upload icon
    And the user browses and selects a valid profile file
    And the user clicks on the Upload button
    Then the user observes that the Profile section is displayed
    And the upload icon is visible and clickable
    And the file selection dialog opens
    And the selected file is displayed in the upload dialog
    And the upload process initiates successfully
    Then a success confirmation message is displayed to the user

    Examples:
      | profile_file       |
      | valid_candidate.pdf |
