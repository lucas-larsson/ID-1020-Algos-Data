package KTH.ID1020;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-02
 * Description: Object class used to transfer multiple data as one object to print to a log
 **/
class Results {
    private  int time;
    private  int length;
    private  String word;
    private  int repetition;

         public Results(int length, String word, int repetition) {
            this.length = length;
            this.word = word;
            this.repetition = repetition;
        }
        @Override
        public String toString() {
            return "results{" +
                    "time=" + time +
                    ", length=" + length +
                    ", word='" + word + '\'' +
                    ", repetition=" + repetition +
                    '}';
        }

        public int getTime() {
            return time;
        }

        public void  setTime(int time) {
            this.time = time;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getRepetition() {
            return repetition;
        }

        public void setRepetition(int repetition) {
            this.repetition = repetition;
        }

}