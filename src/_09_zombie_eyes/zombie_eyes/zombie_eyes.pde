PImage face;
void setup() {
size(1000,1000);
face = loadImage("Face.png");
image(face, 0, 0);

}
void draw() {

image(face, 0, 0);

  if(mousePressed){
  
  ellipse(370, 215, 100, 100);
ellipse(250, 215, 140, 140);


} 
}
