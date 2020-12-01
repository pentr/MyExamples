import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class IndeedWeblinks {
	public static void main(String[] args)throws IOException {

		List<String> urls=new ArrayList<String>();


		urls.add("	http://www.indeed.com/viewjob?jk=ab6228bc4f4ddce5&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMIX0-OLgYEooOSiNCbyoj5zowNGm6Uxbxwk3ba-UrTJyn9V9BUoLKGLZzuiJo_0MB-OEEo_wEuJM9wvB6yDIJ-nTGBvJGFl8WWgaS9CdASl6m1Aj3izkOw87NHJgxznYA&indpubnum=5427925295141725&atk=1e19ju7r2nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=86822346811dc35e&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMIX0-OLgYEooOSiNCbyoj5zowNGm6Uxbxwk3ba-UrTJyn9V9BUoLKGLZzuiJo_0MB-OEEo_wEuJM9wvB6yDIJ-nTGBvJGFl8WWgaS9CdASl6m1Aj3izkOw87NHJgxznYA&indpubnum=5427925295141725&atk=1e19ju7r2nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=7b935faeea096171&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOe6VJQLTARhYpYoMPs8uBvXMwkpbo7sWvpLQO8_IWLpmUnVWEgTyY_h0Cp0v7alyxOhijd_sugmp2xclTvAkIyDll4TQwYDnQpavSP8uqAGg&indpubnum=5427925295141725&atk=1e19ju8ekf22f800	");
		urls.add("	http://www.indeed.com/viewjob?jk=1008d4ad1f46f455&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOe6VJQLTARhYpYoMPs8uBvXMwkpbo7sWvpLQO8_IWLpmUnVWEgTyY_h0Cp0v7alyxOhijd_sugmp2xclTvAkIyDll4TQwYDnQpavSP8uqAGg&indpubnum=5427925295141725&atk=1e19ju8ekf22f800	");
		urls.add("	http://www.indeed.com/viewjob?jk=09747f508d2f19e3&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=d27389177d2d45a5&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=b8b31455b800cc5e&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=f4f3a77fb5a35e2d&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=f9b02318028c4b57&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=74072ed79cd3c344&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=45f9bbf12b8b51dd&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=b959bd1efcc00e70&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=12e246c9713e2fb0&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=9d938baf45abce57&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=ded784940d49cef7&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=dd23605577ab986a&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=11424dabbf588660&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=10856909e0ce1961&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=16dced2e5a5c7c38&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCgjfk_VJ59d6x7s1H45J3w0HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19ju8uefdt0800	");
		urls.add("	http://www.indeed.com/viewjob?jk=296f0ddb1c261682&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=ea1d9f10ae94c840&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=92c98347df3e864a&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=e1dd4233ef79501f&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=5454a84c9db8ec22&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=4a5cc01b65ed09a9&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=f0493e517fe50d80&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=5f7566ac28e964f6&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=7489950e2339e411&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=f23927622af787ec&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=052e0d7e47d78da1&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=341aefc549b80862&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=42c33f2f30e15547&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=1265764d89341ca8&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=3bac9cd2d468f71a&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=0b9edb7b90c097ea&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=c93f3d72cfc75a84&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=5728108cdc22a086&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=5b1bdcaf94e7b1c3&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHChZn6eOrYeekIhQA8l71wY2HqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jua63b68j801	");
		urls.add("	http://www.indeed.com/viewjob?jk=0245a27d2402a928&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=d1ca705469a6093b&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=d88fe07a6065c2d5&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=4183a0a5282938fb&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=23f80e3fc8ed942c&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=abfc78b4355d2d91&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=615c18620c89e0cc&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=13f397ca9c6a5dc3&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=2550449e800b0e37&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=cccadffaa9c71d11&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=c1d87588aa697f32&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=ff646ea0bf0780f3&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=5d3faef1e4297117&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=8e179e66b7875425&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=4e9c8fbe79ac6c34&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=f3277221638dcfe4&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=ca1b95dc571fe50e&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=0ca6f2a19e69ce5f&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=d9646ec36f3120a8&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/viewjob?jk=541aec8bb4789fb9&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyMccZzlpY45xJ5I8E8nRpq7zsQGcGzwJo2dPzKlhd8hAU2h58C9UTot8Sryve1qHCiG1KCmj8FSklWUlGoHvM2yHqeiOfrcDO4wvLXfvaxkxg&indpubnum=5427925295141725&atk=1e19jubg5nh2n800	");
		urls.add("	http://www.indeed.com/pagead/clk?mo=r&ad=-6NYlbfkN0DBsBTNPBv9FNgHvPLDTNdrotDQUfqGJEaUzMimVeaAIlywnSJKGIIgZ-co9MIB9rYNFnsGJNt9yl8mdnzK7v5SISZcYfQVGBGilcp2HWslEgWb-TV9GS2Q456Eqx5hRb8AZA5oE0PZz4uHSd8l2-jztFBOSYtiqiPMNkBiCTVU-Fk10QdnAQ68sFXiMJpqSohTsiHuxC0hcUThQA0GdTiI4dUeOwsTV5QyV6w7SkFpu_0RxHTCIU8G2XJJGSejVjDSDOI_aw5l3IubEeSBzg9F_wnxrp9wp1E5RTROzej1rZrIYhn068zw65Cnty8X5bjisLJLcNT0ygq0eMsfzHQwR-DTFlFyr_kBZ_0AinkidlmpLLdLp2AMta0R00AdfVQgyeVSGuf68MUBh-JnlhrKJzmcI1t6EareD2amFqVufB1Lq6mjk231ogvi2QOadtw9SXHB6mYUKU9sL88fUPAWZ6eycf1FR_jndESgnbYCYfWD3078OyMzqY1ZRndWFGpOWsPTt60izklYeJZRejOe_-b-iwqFRIODxzlqKO_Zsw==&p=0&rjs=1&atk=1e19jud5ef1b4800&utm_source=publisher&utm_medium=sponsored_listings&utm_campaign=sia	");
		urls.add("	http://www.indeed.com/pagead/clk?mo=r&ad=-6NYlbfkN0DuFI_MT1SfQCM8jVLgjKplokPzsgrZ_a9bHRScHUw_j8BnIl60I2R6LdbH0Rx5TIA1v8THjD-ypTS5brIF9ICnfRgOYGzzOZzRCAgBWFRvg4EJ-UK2ZPIx5AkO5l4ysGs80uiDZuX0vSg10dRYNrvJKf7Z_TYhNW3YhYK9AG8ECbU_0aSM8sPUrTFysEUV03Z8zf_rR9ioWa0oNu7uYUpNc9MGFOAmOTtCuox0BCohITEHGHX70DJNw8wAaC-hbEukBCFODm7sdLUGYO_k2AAV2XBF9A6L6UWe1AjYvPWwWZ1mfhEQ7mbp_3NfxnF2bvXZvte2d6Wyny3WqA8cv3ykbxncnxtr3GFIY525JhvipzqnVHnvloG2w2_SUpSZlidkLLn0KP01MNkoN1QPW0KWonV1fDW-DB-BsawFPKl3GOX4rG86dz8WyMuPc_izyDcA98mpEEJM0fg_kjw1Nc0Plfm0ijXRvp6Q80u2kVTpFoyQ85sOnKs0VzTS4aEAsqTHUf5mN3lXSue6pthP7lH20vr8EJK2OI4dAe6mtnZELuI5PSKdwp_nOyZQMJ45sUBHsVXmpKREQA==&p=1&rjs=1&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=9c197570631995ce&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=61a2ab14ea69e4a1&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=e9dd43359de93a1c&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=1ed17dc0eda8b933&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=9ab6cbcb790248d4&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=654770c139900d61&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=ce5ad53691f2ba31&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=0e6ebdd36944b809&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=5dc519ce7dd1b012&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=a9f3ffbbf5af45d8&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=343714f30e24fded&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=2d2df781d9e0139c&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=ef15db364edbc426&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=0d24651962d1b671&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=174ed1d4ca0bda98&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=62a6c9ebc59c413c&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViOC1wrnnrgj0QDi_ghBHXCONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jud5ef1b4800	");
		urls.add("	http://www.indeed.com/viewjob?jk=43b089d27e954598&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=24829b5c6fd81131&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=93ed6040e6318d20&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=f21914ff97d5c3cc&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=1400a672571f2f82&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=338367f72c3a4512&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=cf8b4cf7714a576c&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=73fdac6e351113cc&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=7f1c23da83fcc217&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=afc21dad310d2421&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=8c17eab9abec7b61&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=df41cfcbc39b5f1f&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=443a8dcc4a0bd376&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=42341c7a8d7842aa&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=0c36ddd6d36a16c0&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=3a1a288b2bdf3c2c&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=c4bf66b28221fec3&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=b88c7ecc77e4630d&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=77b1f242f43b7ad0&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=bf2aa4197dec268a&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=ec5c6b27eb8bc663&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=dc4e917bdf30a673&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=99f551649b08ed42&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLViAl4_F6OjEe75e6R2iapVVONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jueh2f2vf800	");
		urls.add("	http://www.indeed.com/viewjob?jk=83a36e6bab55d1ab&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=4c0e519aeeef594e&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=995cbcc0ff414a5b&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=b9eeb9b82f42b355&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=0de95970fb75e2d7&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=ff06fd1450670876&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=81b84ffd468192ee&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=46d4efe55059cd59&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=efa73132474b2bab&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=ad64f3e81e49a923&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyO64R4TtKJO-1xHJv-CusJ2Kf1X0FSgsoYtnO6Imj_QwAKzzCVmZKitaEzJWqrPLVj-ScYXmv08Fxyi3xBOr0XuONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19jufd2ovb7801	");
		urls.add("	http://www.indeed.com/viewjob?jk=cbb952bdc1e9a2be&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOrsA73UHmrStXQCXxj7vczpNvWXiVp2kX9ZMU5QjmQXsAD0PVyHpJgoi-Fy3xqKLOScT6zitdsUiYNANr9f3po&indpubnum=5427925295141725&atk=1e19jug25bina802	");
		urls.add("	http://www.indeed.com/viewjob?jk=c3c1d746eef06178&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOrsA73UHmrStXQCXxj7vczpNvWXiVp2kX9ZMU5QjmQXsAD0PVyHpJgoi-Fy3xqKLOScT6zitdsUiYNANr9f3po&indpubnum=5427925295141725&atk=1e19jug25bina802	");
		urls.add("	http://www.indeed.com/viewjob?jk=eccd2e407ed02d2b&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOrsA73UHmrStXQCXxj7vczpNvWXiVp2kX9ZMU5QjmQXsAD0PVyHpJgoi-Fy3xqKLOScT6zitdsUiYNANr9f3po&indpubnum=5427925295141725&atk=1e19jug25bina802	");
		urls.add("	http://www.indeed.com/viewjob?jk=8a30aa0f0e2c0090&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOrsA73UHmrStXQCXxj7vczpNvWXiVp2kX9ZMU5QjmQXsAD0PVyHpJgoi-Fy3xqKLOScT6zitdsUiYNANr9f3po&indpubnum=5427925295141725&atk=1e19jug25bina802	");
		urls.add("	http://www.indeed.com/viewjob?jk=d364fb8d8b2bdbeb&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOrsA73UHmrStXQCXxj7vczpNvWXiVp2kX9ZMU5QjmQXsAD0PVyHpJgoi-Fy3xqKLOScT6zitdsUiYNANr9f3po&indpubnum=5427925295141725&atk=1e19jug25bina802	");
		urls.add("	http://www.indeed.com/viewjob?jk=90db1d40d844ba91&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyOrsA73UHmrStXQCXxj7vczpNvWXiVp2kX9ZMU5QjmQXsAD0PVyHpJgoi-Fy3xqKLOScT6zitdsUiYNANr9f3po&indpubnum=5427925295141725&atk=1e19jug25bina802	");
		urls.add("	http://www.indeed.com/viewjob?jk=cd73213d19182415&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyNDi8E6bI5qo1ZiakeqANlvzsQGcGzwJo2dPzKlhd8hAVWNYZm4oiIVRdvAE8ot3qgYblXlKHc2GYPvSMRnV1UtJLdCwlcv60Ip7jH1uO3v5g&indpubnum=5427925295141725&atk=1e19jugchbm99800	");
		urls.add("	http://www.indeed.com/viewjob?jk=a53f10cbbdb72481&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyNDi8E6bI5qo1ZiakeqANlvzsQGcGzwJo2dPzKlhd8hAVWNYZm4oiIVRdvAE8ot3qgYblXlKHc2GYPvSMRnV1UtJLdCwlcv60Ip7jH1uO3v5g&indpubnum=5427925295141725&atk=1e19jugchbm99800	");
		urls.add("	http://www.indeed.com/viewjob?jk=4d607ab6e14556fd&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyNDi8E6bI5qo1ZiakeqANlvzsQGcGzwJo2dPzKlhd8hAVWNYZm4oiIVRdvAE8ot3qgYblXlKHc2GYPvSMRnV1UtJLdCwlcv60Ip7jH1uO3v5g&indpubnum=5427925295141725&atk=1e19jugchbm99800	");
		urls.add("	http://www.indeed.com/viewjob?jk=3b89c077c1b86932&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyNDi8E6bI5qo1ZiakeqANlvzsQGcGzwJo2dPzKlhd8hAVWNYZm4oiIVRdvAE8ot3qgYblXlKHc2GYPvSMRnV1UtJLdCwlcv60Ip7jH1uO3v5g&indpubnum=5427925295141725&atk=1e19jugchbm99800	");
		urls.add("	http://www.indeed.com/viewjob?jk=f4085b6c361949c3&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyNt88IGMSXAli3xThyp-wSENQCN8NbHCMiShY8r0m7vGpr-1Jw1mRsOesieu-nKTK7fzmNB4FH5vjgWJPSuk2SvONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19ju6bnbif7800	");
		urls.add("	http://www.indeed.com/viewjob?jk=d299cd3b5571dc46&qd=RUpyYwg65pn4GFpztfzjmjdq_BzfIEfBlf87CJpwCyNt88IGMSXAli3xThyp-wSENQCN8NbHCMiShY8r0m7vGpr-1Jw1mRsOesieu-nKTK7fzmNB4FH5vjgWJPSuk2SvONF_UajJqFsteOnGIgmm5Q&indpubnum=5427925295141725&atk=1e19ju6bnbif7800	");
		Iterator<String> it= urls.iterator();
		Document doc=null;
		Document doc1=null;


		while (it.hasNext()) {
			String urlLinks = (String)it.next();	
			try {
				doc=Jsoup.connect(urlLinks).followRedirects(true).get();

			   
			}catch (Exception e) {
				System.out.println("doc loding");
			}
		}
	}
}