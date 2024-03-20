package com.yt.encryptionandsecurity;

import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class encoding_study {
    public static void main(String[] args) {
        // URL 编码： 对字符进行的编码，表示成 %xx 的形式

        /*
         * Java 标准库提供了一个 URLEncoder 类来对任意字符串进行 URL 编码
         * 1. 如果字符串的内容全是英文、数字和下划线，-，.和 *，则保持不变
         * 2. 如果是上述这些不变的量加上中文或其他字符，则只会对这些其他的字符进行编码，不变的仍然不变
         */
        String encoded = URLEncoder.encode("中文!", StandardCharsets.UTF_8);
        System.out.println(encoded);
        String encoded2 = URLEncoder.encode("Chinese!", StandardCharsets.UTF_8);
        System.out.println(encoded2);
        String encoded3 = URLEncoder.encode("Ch中in文ese!", StandardCharsets.UTF_8);
        System.out.println(encoded3);

        /*
          注意：URL 编码是编码算法，不是加密算法。URL 编码的目的是把任意文本数据编码为%前缀表示的文本，
          编码后的文本仅包含A~Z，a~z，0~9，-，_，.，*和%，便于浏览器和服务器处理。
         */

        // Base64编码：对二进制数据进行编码，表示成文本格式
        /*
         * Base64编码可以把任意长度的二进制数据变为纯文本，且只包含A~Z、a~z、0~9、+、/、=这些字符。“=”是填充字符
         * 如果原始字符串的字节数不是3的整数倍，那么就用0来填充，用来填充的0就被编码成了'='，这就是出现=的原因，并且只会出现在结果出，如果原始字符刚好是3字节的整数倍，那么就没有等号了。
         * 它的原理是把3字节的二进制数据按6bit一组，用4个int整数表示每个组，然后查表，把int整数用索引对应到字符，得到编码后的字符串。
         * 举个例子：3个byte数据分别是e4、b8、ad，按6bit分组得到39、0b、22和2d：
         *
         * 在Java中，二进制数据就是byte[]数组。Java标准库提供了Base64来对byte[]数组进行编解码
         */
        byte [] input = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);
        // 对 base64进行解码
        byte [] output = Base64.getDecoder().decode(b64encoded);
        System.out.println(Arrays.toString(output));
        System.out.println(output.getClass());

        byte [] input2 = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad, (byte) 0x21};
        String b64encoede2 = Base64.getEncoder().encodeToString(input2);
        String b64encoede3 = Base64.getEncoder().withoutPadding().encodeToString(input2);
        System.out.println(b64encoede2);
        System.out.println(b64encoede3);

        // 小结
        /*
        URL编码和Base64编码都是编码算法，它们不是加密算法；

        URL编码的目的是把任意文本数据编码为%前缀表示的文本，便于浏览器和服务器处理；

        Base64编码的目的是把任意二进制数据编码为文本，但编码后数据量会增加1/3。
         */

    }
}
