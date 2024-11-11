public class Intake  {
   
    package frc.robot.subsystems;

    import com.ctre.phoenix6.hardware.TalonFX;
    import edu.wpi.first.wpilibj.DigitalInput;
    import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
    import edu.wpi.first.wpilibj2.command.Command;
    import edu.wpi.first.wpilibj2.command.Commands;
    import edu.wpi.first.wpilibj2.command.SubsystemBase;}

    public class Intake extends subsystemBase {

        VictorSP.intakeMotor1 = new VictorSP(1);
        VictorSP.intakeMotor2 = new VictorSP(2);
        TalonFX. otherMotor = new TalonFX(1);
    }
    DigitalInput beambrake = new DigitalInput(9);

    public Intake() {
        intakeMotor2.setInverted(true);
        intakeMotor1.addFollower(intakeMotor2);

    }

   