#Feedback Gathering Reconfiguration 

This module includes all components for feedback gathering automatic reconfiguration.
This is composed of:

- **Feature model**: eu.supersede.feedbackgathering.reconfiguration.yafmt

This model represents the set of features in the feedback gathering tool. This model is used by the DM reasoner to derive an appropriate configuration. For further information about the DM reasoner see: https://github.com/supersede-project/dyn_adapt/tree/master/DM/components

- **Adapted base model**: eu.supersede.feedbackgathering.reconfiguration.uml

This model represents the adapted base model, this model is provided by the "Adapter" component. For further information about the Adapter see: https://github.com/supersede-project/dyn_adapt/tree/master/Enactment/components/adapter 

- **Model Transformation from UML to Json**: eu.supersede.reconfiguration.enactor.uml2json

This component contains a set of transformation rules to derive a Json file from a UML model. This component is used for both the feedback gathering reconfiguration and the monitoring reconfiguration. 

- **Enacter**: eu.supersede.feedbackgathering.reconfiguration.enactor

This component takes the derived Json entries file to call the Orchestrator services in order to reconfigure the Feedback gathering tool.

See deliverable D4.8 in [Supersede Portal](https://www.supersede.eu/) for more details about this framework, how to install and use it.

Feedback Gathering Reconfiguration is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)

Main contacts: Denisse Yessica Munante Arzapalo <munante@fbk.eu>
