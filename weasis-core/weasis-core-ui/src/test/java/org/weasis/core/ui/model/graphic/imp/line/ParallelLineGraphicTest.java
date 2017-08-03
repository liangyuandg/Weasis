package org.weasis.core.ui.model.graphic.imp.line;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.List;

import org.weasis.core.api.service.WProperties;
import org.weasis.core.ui.model.graphic.Graphic;
import org.weasis.core.ui.test.testers.GraphicTester;

public class ParallelLineGraphicTest extends GraphicTester<ParallelLineGraphic> {
    private static final String XML_0 = "/graphic/parallelLine/parallelLine.graphic.0.xml"; //$NON-NLS-1$
    private static final String XML_1 = "/graphic/parallelLine/parallelLine.graphic.1.xml"; //$NON-NLS-1$

    static final String BASIC_TPL = "<parallelLine fill=\"%s\" showLabel=\"%s\" thickness=\"%s\" uuid=\"%s\">" //$NON-NLS-1$
        + "<paint rgb=\"%s\"/>" //$NON-NLS-1$
        + "<pts/>" //$NON-NLS-1$
        + "</parallelLine>"; //$NON-NLS-1$

    public static final ParallelLineGraphic COMPLETE_OBJECT = new ParallelLineGraphic();
    static {
        COMPLETE_OBJECT.setUuid(GRAPHIC_UUID_1);
        COMPLETE_OBJECT.setColorPaint(Color.CYAN);
        COMPLETE_OBJECT.setLineThickness(2.0f);

        List<Point2D.Double> pts = Arrays.asList(new Point2D.Double(1861.5, 1567.0), new Point2D.Double(1672.5, 1358.0),
            new Point2D.Double(1874.3815487619577, 1489.6972788255084),
            new Point2D.Double(1698.33622905672, 1295.0228247599282), new Point2D.Double(1767.0, 1462.5),
            new Point2D.Double(1786.358888909339, 1392.3600517927184));
        COMPLETE_OBJECT.setPts(pts);
    }

    @Override
    public String getTemplate() {
        return BASIC_TPL;
    }

    @Override
    public Object[] getParameters() {
        return new Object[] { Graphic.DEFAULT_FILLED, Graphic.DEFAULT_LABEL_VISISIBLE, Graphic.DEFAULT_LINE_THICKNESS,
            getGraphicUuid(), WProperties.color2Hexadecimal(Graphic.DEFAULT_COLOR, true) };
    }

    @Override
    public String getXmlFilePathCase0() {
        return XML_0;
    }

    @Override
    public String getXmlFilePathCase1() {
        return XML_1;
    }

    @Override
    public ParallelLineGraphic getExpectedDeserializeCompleteGraphic() {
        return COMPLETE_OBJECT;
    }
}
