# Lab_Assignment_3_ChainOfResponsibilityPattern
<h2>Automated Waste Management System</h2>
<b>Background:</b> Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.
<br>
<br>
<b>Objective:</b> Develop an automated waste management system that uses a chain of responsibility pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.
<br>
<br>

<b>Requirements:</b>
<br>
1. <b>Waste Container:</b> Create a class to represent waste containers, each with a specific capacity and type of waste (e.g., organic, recyclable, hazardous). 
<br>

2. <b>Waste Collection Chain:</b> Implement a chain of responsibility pattern to handle different types of waste containers. Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.
<br>

3. <b>Waste Collection Process:</b>
  - The system should initialize a chain of waste collectors, each responsible for a different type of waste.
  - When a waste container is full or needs disposal, the system should trigger the waste collection process.
  - The appropriate waste collector in the chain should handle the disposal based on the type and capacity of the waste container.
<br>

4. <b>Validation:</b> Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.

<h2>UML Diagram</h2> 
![Description](https://github.com/TrixiePicana/Lab_Assignment_3_ChainOfResponsibilityPattern/blob/main/LabAssignment3ChainofResponsibilityPattern_page-0001.jpg) 
