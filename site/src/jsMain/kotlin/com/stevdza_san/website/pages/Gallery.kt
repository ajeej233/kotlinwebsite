package com.stevdza_san.website.pages

import androidx.compose.runtime.Composable
import com.stevdza_san.website.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.GridAutoFlow.Column
import org.jetbrains.compose.web.css.dppx
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text


@Page
@Composable
fun Gallery(){
    val imageUrls = listOf(
        "image1.jpeg",
        "image2.jpeg",
        "image7.jpeg",
        "image3.jpeg",
        "image10.jpeg",
        "image4.jpeg",
        "image5.jpeg",
        "image6.jpeg"

        // Add more image URLs as needed
    )
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxWidth().height(50.px).background(Color.deeppink).border(2.px)) {
            SpanText(
                text = "Galley",
                modifier = Modifier.fillMaxWidth().fillMaxHeight()
                    .margin( 5.px)
                    .fontFamily(Res.String.ROBOTO_CONDENSED)
                    .color( Colors.White)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(
                         TextAlign.Center

                    )
            )
        }

        val chunkedImages = imageUrls.chunked(3)
        chunkedImages.forEach { rowImages ->
            Row(Modifier.fillMaxWidth()) {
                rowImages.forEach { imageUrl ->
                    Column {
                        Image(
                            src = imageUrl,
                            modifier = Modifier.height(400.px).width(300.px).padding(8.px)
                        )
                        SpanText(
                            text = imageUrl.replace(".jpeg",""),
                            modifier = Modifier.fillMaxWidth()
                                .margin(bottom = 12.px)
                                .fontFamily(Res.String.ROBOTO_CONDENSED)
                                .color( Colors.Black)
                                .fontSize(15.px)
                                .fontWeight(FontWeight.Bold)
                                .textAlign(
                                    TextAlign.Center

                                )
                        )
                    }

                }
            }
        }
    }
}
