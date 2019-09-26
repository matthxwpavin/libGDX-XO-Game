package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MyGdxGame extends ApplicationAdapter {
	public static final String TITLE="XOGame";
	public static final int WIDTH =800;
	public static final int HEIGHT =480;

	private Rectangle R1;
	private  Rectangle R2;
	private  Rectangle R3;
	private  Rectangle R4;
	private  Rectangle R5;
	private  Rectangle R6;
	private  Rectangle R7;
	private  Rectangle R8;
	private  Rectangle R9;

	Switch aSwitch;


	private OrthographicCamera camera;
	private SpriteBatch batch;

	private Texture XImage;
	private Texture OImage;
	private Texture TableImage;
	private Rectangle XRec;
	private Rectangle ORec;
	
	@Override
	public void create () {
		TableImage = new Texture(Gdx.files.internal("Table.png"));
		XImage = new Texture(Gdx.files.internal("X.png"));
		OImage = new Texture(Gdx.files.internal("O.png"));

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);

		batch = new SpriteBatch();

		XRec = new Rectangle();
		XRec.width = 150;
		XRec.height = 150;

		ORec = new Rectangle();
		ORec.width = 170;
		ORec.height = 150;

		R1=new Rectangle();
		R1.x=0;
		R1.y=HEIGHT/3;
		R1.width=WIDTH/3;
		R1.height=HEIGHT/3;

		R2=new Rectangle();
		R2.x=WIDTH/3;
		R2.y=HEIGHT/3;
		R2.width=WIDTH/3;
		R2.height=HEIGHT/3;

		R3=new Rectangle();
		R3.x=2*(WIDTH/3);
		R3.y=HEIGHT/3;
		R3.width=WIDTH/3;
		R3.height=HEIGHT/3;

		R4=new Rectangle();
		R4.x=0;
		R4.y=2*(HEIGHT/3);
		R4.width=WIDTH/3;
		R4.height=HEIGHT/3;

		R5=new Rectangle();
		R5.x=WIDTH/3;
		R5.y=2*(HEIGHT/3);
		R5.width=WIDTH/3;
		R5.height=HEIGHT/3;

		R6=new Rectangle();
		R6.x=2*(WIDTH/3);
		R6.y=2*(HEIGHT/3);
		R6.width=WIDTH/3;
		R6.height=HEIGHT/3;

		R7=new Rectangle();
		R7.x=0;
		R7.y=3*(HEIGHT/3);
		R7.width=WIDTH/3;
		R7.height=HEIGHT/3;

		R8=new Rectangle();
		R8.x=WIDTH/3;
		R8.y=3*(HEIGHT/3);
		R8.width=WIDTH/3;
		R8.height=HEIGHT/3;

		R9=new Rectangle();
		R9.x=2*(WIDTH/3);
		R9.y=3*(HEIGHT/3);
		R9.width=WIDTH/3;
		R9.height=HEIGHT/3;

		aSwitch = new Switch();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		batch.setProjectionMatrix(camera.combined);

		batch.begin();

		batch.draw(TableImage,0,0);

		if(aSwitch.R1on()&&(aSwitch.getTextureR1()==0))
			batch.draw(XImage, R1.width / 2 - XRec.width / 2, R1.height / 2 - XRec.height / 2);
		if(aSwitch.R1on()&&(aSwitch.getTextureR1()==1))
			batch.draw(OImage, R1.width / 2 - ORec.width / 2, R1.height / 2 - ORec.height / 2);
		if(aSwitch.R2on()&&(aSwitch.getTextureR2()==0))
			batch.draw(XImage, R2.x + (R2.width / 2) - XRec.width / 2, R2.height / 2 - XRec.height / 2);
		if(aSwitch.R2on()&&(aSwitch.getTextureR2()==1))
			batch.draw(OImage, R2.x + (R2.width / 2) - ORec.width / 2, R2.height / 2 - ORec.height / 2);
		if(aSwitch.R3on()&&(aSwitch.getTextureR3()==0))
			batch.draw(XImage, R3.x + (R3.width / 2) - XRec.width / 2, R3.height / 2 - XRec.height / 2);
		if(aSwitch.R3on()&&(aSwitch.getTextureR3()==1))
			batch.draw(OImage, R3.x + (R3.width / 2) - ORec.width / 2, R3.height / 2 - ORec.height / 2);
		if(aSwitch.R4on()&&(aSwitch.getTextureR4()==0))
			batch.draw(XImage, R4.width / 2 - XRec.width / 2, R4.y - (R4.height / 2) - XRec.height / 2);
		if(aSwitch.R4on()&&(aSwitch.getTextureR4()==1))
			batch.draw(OImage, R4.width / 2 - ORec.width / 2, R4.y - (R4.height / 2) - ORec.height / 2);
		if(aSwitch.R5on()&&(aSwitch.getTextureR5()==0))
			batch.draw(XImage, R5.x + (R5.width / 2) - XRec.width / 2, R5.y - (R5.height / 2) - XRec.height / 2);
		if(aSwitch.R5on()&&(aSwitch.getTextureR5()==1))
			batch.draw(OImage, R5.x + (R5.width / 2) - ORec.width / 2, R5.y - (R5.height / 2) - ORec.height / 2);
		if(aSwitch.R6on()&&(aSwitch.getTextureR6()==0))
			batch.draw(XImage, R6.x + (R6.width / 2) - XRec.width / 2, R6.y - (R6.height / 2) - XRec.height / 2);
		if(aSwitch.R6on()&&(aSwitch.getTextureR6()==1))
			batch.draw(OImage, R6.x + (R6.width / 2) - ORec.width / 2, R6.y - (R6.height / 2) - ORec.height / 2);
		if(aSwitch.R7on()&&(aSwitch.getTextureR7()==0))
			batch.draw(XImage, R7.width / 2 - XRec.width / 2, R7.y - (R7.height / 2) - XRec.height / 2);
		if(aSwitch.R7on()&&(aSwitch.getTextureR7()==1))
			batch.draw(OImage, R7.width / 2 - ORec.width / 2, R7.y - (R7.height / 2) - ORec.height / 2);
		if(aSwitch.R8on()&&(aSwitch.getTextureR8()==0))
			batch.draw(XImage, R8.x + (R8.width / 2) - XRec.width / 2, R8.y - (R8.height / 2) - XRec.height / 2);
		if(aSwitch.R8on()&&(aSwitch.getTextureR8()==1))
			batch.draw(OImage, R8.x + (R8.width / 2) - ORec.width / 2, R8.y - (R8.height / 2) - ORec.height / 2);
		if(aSwitch.R9on()&&(aSwitch.getTextureR9()==0))
			batch.draw(XImage, R9.x + (R9.width / 2) - XRec.width / 2, R9.y - (R9.height / 2) - XRec.height / 2);
		if(aSwitch.R9on()&&(aSwitch.getTextureR9()==1))
			batch.draw(OImage, R9.x + (R9.width / 2) - ORec.width / 2, R9.y - (R9.height / 2) - ORec.height / 2);


		batch.end();


		if(Gdx.input.isTouched()) {

			Vector3 touchPos = new Vector3();
			touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			camera.unproject(touchPos);
			if((touchPos.x<R2.x&&touchPos.y<R1.y)&&aSwitch.R1on()==false)
				aSwitch.setR1();
			if((touchPos.x>R2.x&&touchPos.x<R3.x)&&touchPos.y<R2.y&&(aSwitch.R2on()==false))
				aSwitch.setR2();
			if(touchPos.x>R3.x&&touchPos.y<R3.y&&(aSwitch.R3on()==false))
				aSwitch.setR3();
			if(touchPos.x<R5.x&&(touchPos.y>R1.y&&touchPos.y<R4.y)&&(aSwitch.R4on()==false))
				aSwitch.setR4();
			if((touchPos.x>R5.x&&touchPos.x<R6.x)&&(touchPos.y<R5.y&&touchPos.y>R2.y)&&(aSwitch.R5on()==false))
				aSwitch.setR5();
			if((touchPos.y<R6.y&&touchPos.y>R3.y)&&touchPos.x>R6.x&&(aSwitch.R6on()==false))
				aSwitch.setR6();
			if(touchPos.x<R8.x&&touchPos.y>R4.y&&(aSwitch.R7on()==false))
				aSwitch.setR7();
			if((touchPos.x>R8.x&&touchPos.x<R9.x)&&touchPos.y>R5.y&&(aSwitch.R8on()==false))
				aSwitch.setR8();
			if(touchPos.x>R9.x&&touchPos.y>R6.y&&(aSwitch.R9on()==false))
				aSwitch.setR9();


		}
	}
	
	@Override
	public void dispose () {
		XImage.dispose();
		OImage.dispose();
		batch.dispose();



	}
}
