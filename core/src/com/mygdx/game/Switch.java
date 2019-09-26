package com.mygdx.game;

public class Switch {
        private  boolean R1on;
        private  boolean R2on;
        private  boolean R3on;
        private  boolean R4on;
        private  boolean R5on;
        private  boolean R6on;
        private  boolean R7on;
        private  boolean R8on;
        private  boolean R9on;



        private int[] TextureR= new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};

        private int clickCount;

        public void Switch(){
            this.R1on=false;
            this.R2on=false;
            this.R3on=false;
            this.R4on=false;
            this.R5on=false;
            this.R6on=false;
            this.R7on=false;
            this.R8on=false;
            this.R9on=false;

            clickCount=0;
        }

        public int getClickCount(){
            return clickCount;
        }

        public boolean R1on(){
            return R1on;
        }
        public boolean R2on(){
            return R2on;
        }
        public boolean R3on(){
            return R3on;
        }
        public boolean R4on(){
            return R4on;
        }
        public boolean R5on(){
            return R5on;
        }
        public boolean R6on(){
            return R6on;
        }
        public boolean R7on(){
            return R7on;
        }
        public boolean R8on(){
            return R8on;
        }
        public boolean R9on(){
            return R9on;
        }

        public void setR1() {
            R1on = true;
            clickCount++;
            TextureR[0]=clickCount%2;
        }

        public void setR2() {
            R2on = true;
            clickCount++;
            TextureR[1]=clickCount%2;


        }

        public void setR3() {
            R3on = true;
            clickCount++;
            TextureR[2]=clickCount%2;
        }

        public void setR4() {
            R4on = true;
            clickCount++;
            TextureR[3]=clickCount%2;
        }

        public void setR5() {
            R5on = true;
            clickCount++;
            TextureR[4]=clickCount%2;
        }

        public void setR6() {
            R6on = true;
            clickCount++;
            TextureR[5]=clickCount%2;
        }

        public void setR7() {
            R7on = true;
            clickCount++;
            TextureR[6]=clickCount%2;
        }

        public void setR8() {
            R8on = true;
            clickCount++;
            TextureR[7]=clickCount%2;
        }

        public void setR9() {
            R9on = true;
            clickCount++;
            TextureR[8]=clickCount%2;
        }

    public int getTextureR1() {
        return TextureR[0];
    }

    public int getTextureR2() {
        return TextureR[1];
    }

    public int getTextureR3() {
        return TextureR[2];
    }

    public int getTextureR4() {
        return TextureR[3];
    }

    public int getTextureR5() {
        return TextureR[4];
    }

    public int getTextureR6() {
        return TextureR[5];
    }

    public int getTextureR7() {
        return TextureR[6];
    }

    public int getTextureR8() {
        return TextureR[7];
    }

    public int getTextureR9() {
        return TextureR[8];
    }
}

