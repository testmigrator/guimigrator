import SwiftUI

struct Dialog_discount_fragment: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Enter the discount code").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          Image("close_black").background(Color.clear).padding(5.0)
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 8) {
          /* TODO: TextInputLayout label */
          TextField("Discount code", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 16.0).padding(.bottom, 16.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 16.0)
        .padding(.bottom, 16.0)
        Button(action: { }) {
          Text("OK").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.borderedProminent)
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(16.0)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity)
  }
}

struct Dialog_discount_fragment_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_discount_fragment()
  }
}
