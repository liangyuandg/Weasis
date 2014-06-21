package org.weasis.dicom.viewer2d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.weasis.core.ui.editor.image.ImageViewerPlugin;
import org.weasis.core.ui.util.WtoolBar;

public class DcmHeaderToolBar<DicomImageElement> extends WtoolBar {

    public DcmHeaderToolBar(int index) {
        super("DICOM Header Bar", index);

        final JButton metaButton =
            new JButton(new ImageIcon(ImageViewerPlugin.class.getResource("/icon/32x32/text-x-generic.png"))); //$NON-NLS-1$
        metaButton.setToolTipText("Open DICOM Information");
        metaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ImageViewerPlugin<?> container = EventManager.getInstance().getSelectedView2dContainer();
                if (container instanceof View2dContainer) {
                    ((View2dContainer) container).displayHeader();
                }
            }
        });
        add(metaButton);
    }

}
