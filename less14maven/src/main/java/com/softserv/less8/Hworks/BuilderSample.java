package com.softserve.edu.less8.Hworks;

public class BuilderSample {
       public static void main(String[] args) {
            PersonalComputer pc = PersonalComputer.getBuilder()
                    .addMatherBoard("Gigabyte Z490 UD AC (s1200, Intel Z490, PCI-Ex16)")
                    .addProcessor("Intel Core i5-10400F 2.9GHz/12MB (BX8070110400F) s1200 BOX")
                    .addMemory("HyperX DDR4-3000 8192MB PC4-24000 Predator RGB Black (HX430C15PB3A/8)")
                    .addHdd("Western Digital Blue 1TB 5400rpm 64MB WD10EZRZ 3.5 SATAIII")
                    .addMonitor("BenQ Zowie XL2411P (9H.LGPLB.QBE/9H.LGPLB.QPE)")
                    .build();
            System.out.println(pc);
            PersonalComputer myPc = PersonalComputer.getBuilder()
                    .addHdd("SDD 256GB")
                    .addProcessor("Intel i9,5-XXXXhd")
                    .addHdd("HDD jogo znaje")
                    .build();
           System.out.println(myPc);
        }

}

 class PersonalComputer {

    private String matherBoard;
    private String processor;
    private String memory;
    private String hdd;
    private String monitor;

    private PersonalComputer() {
        matherBoard = "";
        processor = "";
        memory = "";
        hdd = "";
        monitor = "";
    }

    // getters

    public String getMatherBoard() {
        return matherBoard;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMemory() {
        return memory;
    }

    public String getHdd() {
        return hdd;
    }

    public String getMonitor() {
        return monitor;
    }

    // setters

    private void setMatherBoard(String matherBoard) {
        this.matherBoard = matherBoard;
    }

    private void setProcessor(String processor) {
        this.processor = processor;
    }

    private void setMemory(String memory) {
        this.memory = memory;
    }

    private void setHdd(String hdd) {
        this.hdd = hdd;
    }

    private void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PersonalComputer [\nmatherBoard\t=" + matherBoard
                + ", \nprocessor\t=" + processor
                + ", \nmemory\t=" + memory
                + ", \nhdd\t=" + hdd
                + ", \nmonitor\t=" + monitor
                + "\n]";
    }

    public static Builder getBuilder() {
        PersonalComputer personalComputer = new PersonalComputer();
        return personalComputer.new Builder();
    }

    // -------------------------------------------------------------
    // inner class

    public class Builder {

        private Builder() {
        }

        public Builder addMatherBoard(String matherBoard) {
            // Check matherBoard
            setMatherBoard(matherBoard);
            return this;
        }

        public Builder addProcessor(String processor) {
            setProcessor(processor);
            return this;
        }

        public Builder addMemory(String memory) {
            setMemory(memory);
            return this;
        }

        public Builder addHdd(String hdd) {
            setHdd(hdd);
            return this;
        }

        public Builder addMonitor(String monitor) {
            setMonitor(monitor);
            return this;
        }

        public PersonalComputer build() {
            // TODO
            return PersonalComputer.this;
        }
    }

}