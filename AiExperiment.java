class AiExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    void runEpochs(int epochs) {
        completedEpochs += epochs;
    }

    void runEpochs(int epochs, int bonusEpochs) {
        int totalEpochsToAdd = epochs + bonusEpochs; // Local variable requirement
        completedEpochs += totalEpochsToAdd;
    }

    int remainingEpochs() {
        return targetEpochs - completedEpochs;
    }

    String status() {
        return "Experiment: " + experimentName + " | Progress: " + completedEpochs + "/" + targetEpochs + " Epochs";
    }
}