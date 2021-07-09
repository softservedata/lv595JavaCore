package com.softserve.edu12build;

public class Appl {
	public static void main(String[] args) {
		PersonalComputer pc = PersonalComputer.getBuilder()
				.addMatherBoard("Gigabyte Z490 UD AC (s1200, Intel Z490, PCI-Ex16)")
				.addProcessor("Intel Core i5-10400F 2.9GHz/12MB (BX8070110400F) s1200 BOX")
				.addMemory("HyperX DDR4-3000 8192MB PC4-24000 Predator RGB Black (HX430C15PB3A/8)")
				.addHdd("Western Digital Blue 1TB 5400rpm 64MB WD10EZRZ 3.5 SATAIII")
				.addMonitor("BenQ Zowie XL2411P (9H.LGPLB.QBE/9H.LGPLB.QPE)")
				.build();
		System.out.println(pc);
	}
}
