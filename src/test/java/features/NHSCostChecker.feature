Feature:Check what help you could get to pay for NHS costs

  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need


  Background:
    When I open NHS Service URL
    Then I validate title and URL

  @Smoketest
  Scenario Outline:Enter Location and Age based circumstance into the checker tool and get the result for the treatments
    When Tescase"<TCNum>" number and Testcase Description "<TCDesc>"
    Given I am a person from Wales
    When I put my circumstances into the Checker tool based on "<Age>"
    Then I should get a result of whether I will get help or not "<TCNum>"

    Examples:
      |TCNum  |TCDesc                                                               |Age  |
      |TC_01  |To verify Age=15,Location based circumstance into the checker tool   |15   |
      |TC_02  |To verify Age=17,Location based circumstance into the checker tool   |17   |
      |TC_03  |To verify Age=18,Location based circumstance into the checker tool   |18   |
      |TC_04  |To verify Age=19,Location based circumstance into the checker tool   |19   |
      |TC_05  |To verify Age=20,Location based circumstance into the checker tool   |20   |
      |TC_06  |To verify Age=24,Location based circumstance into the checker tool   |24   |
      |TC_07  |To verify Age=60,Location based circumstance into the checker tool   |60   |
      |TC_08  |To verify Age=61,Location based circumstance into the checker tool   |61   |
