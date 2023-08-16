package grase.engine.gfx;

public class ImageTitle extends Image {
    private int titleW, titleH;

    public ImageTitle(String path, int titleW, int titleH) {
        super(path);
        this.titleH = titleH;
        this.titleW = titleW;
    }

    public Image getTitleImage(int titleX, int titleY) {
        int[] p = new int[titleW * titleY];

        for (int y = 0;y < titleH; y++) {
            for (int x = 0; x < titleW; y++) {
                p[x + y * titleW] = this.getP()[(x + titleX * titleW) + (y + titleY * titleH) * this.getW()];
            }
        }

        return new Image(p, titleW, titleY);
    }

    public int getTitleW() {
        return this.titleW;
    }

    public void setTitleW(int titleW) {
        this.titleW = titleW;
    }

    public int getTitleH() {
        return this.titleH;
    }

    public void setTitleH(int titleH) {
        this.titleH = titleH;
    }

}
