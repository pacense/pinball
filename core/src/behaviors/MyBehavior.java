package behaviors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;

import actores.Ball;
import bodies.MyBody;
import interfaces.IChocable;

public abstract class MyBehavior implements IChocable{
	MyBody myBody;
	
	public MyBehavior(MyBody myBody) {
		this.myBody=myBody;
	}
	
	public abstract void act(float delta);
	public abstract void draw(Batch batch, float parentAlpha);
	
	@Override
	public void chocar(Body bolaBody) {
		// TODO los hijos sobrescriben al padre
		
	}
	
	
	
	
}
