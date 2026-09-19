class AiExperimentDemo {

    void helperMutateExperiment(AiExperiment exp) {
        exp.runEpochs(5);
    }

    public static void main(String[] args) {
        AiExperimentDemo demoHelper = new AiExperimentDemo();

        // R2: Instantiate two independent objects
        AiExperiment exp1 = new AiExperiment();
        exp1.experimentName = "LLM Fine-Tuning";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        AiExperiment exp2 = new AiExperiment();
        exp2.experimentName = "Vision Transformer";
        exp2.completedEpochs = 5;
        exp2.targetEpochs = 20;

        // Initial status output
        System.out.println("Initial Status:");
        System.out.println(exp1.status() + " | Remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.status() + " | Remaining: " + exp2.remainingEpochs());

        // R3 & R4: Test runEpochs and overloaded runEpochs
        exp1.runEpochs(10);
        exp2.runEpochs(5, 2);

        // R8: Independent object verification
        System.out.println("\nAfter Independent Modifications: ");
        System.out.println(exp1.status() + " | Remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.status() + " | Remaining: " + exp2.remainingEpochs());

        // R9: Pass object to helper method and mutate
        System.out.println("\nPass By Value Mutation Test:");
        System.out.println("Before Helper: " + exp1.status());
        demoHelper.helperMutateExperiment(exp1);
        System.out.println("After Helper: " + exp1.status());
    }
}