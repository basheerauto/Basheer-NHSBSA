<table width="708">
<tbody>
<tr>
<td width="708">
<p><strong>NHSBSA-Automation Task- Eligibility Checker</strong></p>
</td>
</tr>
</tbody>
</table>
<table style="width: 768.988px;">
<tbody>
<tr>
<td style="width: 163px;">
<p><strong>Task description</strong></p>
</td>
<td style="width: 589.988px;">
<p>To Verify Check what help you could get to pay for NHS costs for Wales people</p>
<p>As a person from Wales</p>
<p>I need to know what help I can get with my NHS costs</p>
<p>So that I can get the treatment I need</p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Features To be tested</strong></p>
</td>
<td style="width: 589.988px;">
<table>
<tbody>
<tr>
<td>&nbsp;</td>
</tr>
</tbody>
</table>
<p>Feature:Check what help you could get to pay for NHS costs</p>
<p>&nbsp;</p>
<p>&nbsp; As a person from Wales</p>
<p>&nbsp; I need to know what help I can get with my NHS costs</p>
<p>&nbsp; So that I can get the treatment I need</p>
<p>&nbsp;</p>
<p>&nbsp; Background:</p>
<p>&nbsp;&nbsp;&nbsp; When I open NHS Service URL</p>
<p>&nbsp;&nbsp;&nbsp; Then I validate title and URL</p>
<p>&nbsp;</p>
<p>&nbsp; @Smoketest</p>
<p>&nbsp; Scenario Outline:Enter Location and Age based circumstance into the checker tool and get the result for the treatments</p>
<p>&nbsp;&nbsp;&nbsp; When Tescase"&lt;TCNum&gt;" number and Testcase Description "&lt;TCDesc&gt;"</p>
<p>&nbsp;&nbsp;&nbsp; Given I am a person from Wales</p>
<p>&nbsp;&nbsp;&nbsp; When I put my circumstances into the Checker tool based on "&lt;Age&gt;"</p>
<p>&nbsp;&nbsp;&nbsp; Then I should get a result of whether I will get help or not "&lt;TCNum&gt;"</p>
<p>&nbsp;</p>
<p>&nbsp;&nbsp;&nbsp; Examples:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TCNum&nbsp; |TCDesc&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |Age&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_01 &nbsp;|To verify Age=15,Location based circumstance into the checker tool&nbsp;&nbsp; |15&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_02&nbsp; |To verify Age=17,Location based circumstance into the checker tool&nbsp;&nbsp; |17&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_03&nbsp; |To verify Age=18,Location based circumstance into the checker tool&nbsp;&nbsp; |18&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_04&nbsp; |To verify Age=19,Location based circumstance into the checker tool&nbsp;&nbsp; |19&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_05&nbsp; |To verify Age=20,Location based circumstance into the checker tool&nbsp;&nbsp; |20&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_06&nbsp; |To verify Age=24,Location based circumstance into the checker tool&nbsp;&nbsp; |24&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_07&nbsp; |To verify Age=60,Location based circumstance into the checker tool&nbsp;&nbsp; |60&nbsp;&nbsp; |</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |TC_08&nbsp; |To verify Age=61,Location based circumstance into the checker tool&nbsp;&nbsp; |61&nbsp;&nbsp; |</p>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Framework</strong></p>
</td>
<td style="width: 589.988px;">
<p><strong>BDD framework</strong></p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Framework Design Tools</strong></p>
</td>
<td style="width: 589.988px;">
<p><strong>Java 1.8 , BDD Cucumber, Selenium, Maven, JVM Cucumber Report, POM Pattern</strong></p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Version Control</strong></p>
</td>
<td style="width: 589.988px;">
<p><strong>GITHUB :Clone Repo URL</strong> <a href="https://github.com/basheerauto/Basheer-NHSBSA">https://github.com/basheerauto/Basheer-NHSBSA</a></p>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Author </strong></p>
</td>
<td style="width: 589.988px;">
<p>Basheer Ahamed</p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Document Version</strong></p>
</td>
<td style="width: 589.988px;">
<p>Ver:0.1</p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Command prompts Run </strong></p>
</td>
<td style="width: 589.988px;">
<p><strong>Before run command prompts navigate to project folder path  </strong></p>
<p><strong>mvn clean test &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Default its run in chrome Browser )</strong></p>
<p><strong>mvn clean test -Dbrowser=firefox&nbsp; &nbsp;(It will run in firefox browser)</strong></p>
</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Browser</strong></p>
</td>
<td style="width: 589.988px;">Chrome Driver Browser, Firefox</td>
</tr>
<tr>
<td style="width: 163px;">
<p><strong>Test Report path</strong></p>
</td>
<td style="width: 589.988px;"><strong>HTML Report</strong>: Project folder-->target/Cucumber-html-report/index.html
  <strong>JVM Cucumber Report</strong>: Project Folder---> target/Cucumber-JVM-Reports/cucumber-html-reports/feature-overview.html</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
