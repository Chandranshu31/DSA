<h2><a href="https://leetcode.com/problems/find-the-key-of-the-numbers/description/">3568. Find the Key of the Numbers</a></h2><h3>Easy</h3><hr><p>You are given three <strong>positive</strong> integers <code>num1</code>, <code>num2</code>, and <code>num3</code>.</p>

<p>The <code>key</code> of <code>num1</code>, <code>num2</code>, and <code>num3</code> is defined as a four-digit number such that:</p>

<ul>
	<li>Initially, if any number has <strong>less than</strong> four digits, it is padded with <strong>leading zeros</strong>.</li>
	<li>The <code>i<sup>th</sup></code> digit (<code>1 &lt;= i &lt;= 4</code>) of the <code>key</code> is generated by taking the <strong>smallest</strong> digit among the <code>i<sup>th</sup></code> digits of <code>num1</code>, <code>num2</code>, and <code>num3</code>.</li>
</ul>

<p>Return the <code>key</code> of the three numbers <strong>without</strong> leading zeros (<em>if any</em>).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num1 = 1, num2 = 10, num3 = 1000</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>On padding, <code>num1</code> becomes <code>&quot;0001&quot;</code>, <code>num2</code> becomes <code>&quot;0010&quot;</code>, and <code>num3</code> remains <code>&quot;1000&quot;</code>.</p>

<ul>
	<li>The <code>1<sup>st</sup></code> digit of the <code>key</code> is <code>min(0, 0, 1)</code>.</li>
	<li>The <code>2<sup>nd</sup></code> digit of the <code>key</code> is <code>min(0, 0, 0)</code>.</li>
	<li>The <code>3<sup>rd</sup></code> digit of the <code>key</code> is <code>min(0, 1, 0)</code>.</li>
	<li>The <code>4<sup>th</sup></code> digit of the <code>key</code> is <code>min(1, 0, 0)</code>.</li>
</ul>

<p>Hence, the <code>key</code> is <code>&quot;0000&quot;</code>, i.e. 0.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num1 = 987, num2 = 879, num3 = 798</span></p>

<p><strong>Output:</strong> <span class="example-io">777</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num1 = 1, num2 = 2, num3 = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num1, num2, num3 &lt;= 9999</code></li>
</ul>
