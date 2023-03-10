class InnerClass{
	public static void main(String[] args){

		// local inner class
		// CPU cpu = new CPU(10000);
		// cpu.DisplayDetail();

		// method inner class
		CPU cpu = new CPU(1000);
		CPU.Processor processor = cpu.new Processor(6,"intel");
		processor.DisplayProcessorDetail();
		System.out.println("catch of processor : "+processor.Catch());
		System.out.println();

		CPU.RAM ram = cpu.new RAM(32,"intel",3.4);
		ram.DisplayRamDetail();
		System.out.println("RAM ClockSpeed : "+ram.GetClockSpeed());

		// anonymous inner class()
		// CPU cpu = new CPU(100);
		// CPU.GPU gpu = cpu.new GPU(){
		// 	void GPUDetail(){
		// 		System.out.println("GPU occupie 4GB");
		// 	}	
		// };
		// gpu.GPUDetail();
	}
}

 class CPU{
	double price;
	CPU(double price){
		this.price = price;
	}

	void GPU(){}

	// local inner class
	void DisplayDetail(){
		class RAM{
			double memory;
			String manufacturar;
			double clockspeed;

			RAM(double memory, String manufacturar, double clockspeed){
				this.memory = memory;
				this.manufacturar = manufacturar;
				this.clockspeed = clockspeed;
			}

			double GetClockSpeed(){
				return 3.4;
			}

			void DisplayRamDetail(){
				System.out.println("Size Of RAM In CPU : "+ memory);
				System.out.println("ClockSpeed of Ram : "+ clockspeed);
				System.out.println("Manufacturar Of RAM : "+ manufacturar);
				System.out.println("Price Of CPU : "+ price);
			}
		} 

		RAM ram = new RAM(32, "samsung",3.4);
		ram.DisplayRamDetail();
	}


	// nessted class
	class Processor{
		double core;
		String manufacturar;

		Processor(double core, String manufacturar){
			this.core = core;
			this.manufacturar = manufacturar;
		}

		double Catch(){
			return 10.0;
		}

		void DisplayProcessorDetail(){
			System.out.println("Number Of Core In CPU : "+ core);
			System.out.println("Manufacturar Of CPU : "+ manufacturar);
			System.out.println("Price Of CPU : "+ price);
		}
	}

	// protected class RAM
	class RAM{
		double memory;
		String manufacturar;
		double clockspeed;

		RAM(double memory, String manufacturar, double clockspeed){
			this.memory = memory;
			this.manufacturar = manufacturar;
			this.clockspeed = clockspeed;
		}

		double GetClockSpeed(){
			return 3.4;
		}

		void DisplayRamDetail(){
			System.out.println("Size Of RAM In CPU : "+ memory);
			System.out.println("ClockSpeed of Ram : "+ clockspeed);
			System.out.println("Manufacturar Of RAM : "+ manufacturar);
		}
	}

	abstract class GPU{
		abstract void GPUDetail();
	}
}
